package com.bangkit.signforyou.ui.dictionary.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bangkit.signforyou.data.Dictionary
import com.bangkit.signforyou.databinding.ActivityDetailBinding
import com.bangkit.signforyou.utils.Dictionaries
import com.bangkit.signforyou.utils.GlideApp
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class DetailActivity : AppCompatActivity(){

    private var currentPosition = 0
    private lateinit var binding: ActivityDetailBinding
    companion object{
        const val POSITION = "position"
    }
    val list = Dictionaries.getAllDictionary()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateView(list[0])
        val extras = intent.extras
        if (extras != null){
            currentPosition = extras.getInt(POSITION)
            getDictionary(currentPosition)?.let { updateView(it) }

        }

        binding.nextBtn.setOnClickListener {
            currentPosition++
            getDictionary(currentPosition)?.let { updateView(it) }
        }
        binding.prevBtn.setOnClickListener {
            currentPosition--
            getDictionary(currentPosition)?.let { updateView(it) }
        }
        binding.backBtnHome.setOnClickListener {
            onBackPressed()
        }



    }

    fun updateView(dictionary: Dictionary){
        binding.titleDetail.text = dictionary.title

        if (dictionary.position == 1) {
            binding.prevBtn.visibility = View.GONE
        }
        else {
            binding.prevBtn.visibility = View.VISIBLE
        }

        if (dictionary.position == list.size) {
            binding.nextBtn.visibility = View.GONE
        }
        else {
            binding.nextBtn.visibility = View.VISIBLE
        }

        var firebaseStorage: FirebaseStorage? = null
        var storageReference: StorageReference? = null

        firebaseStorage = FirebaseStorage.getInstance()
        storageReference = firebaseStorage.reference
        val refPhotoDictionary = storageReference.child("dictionary/${dictionary.title}.png")


        GlideApp.with(this)
            .load(refPhotoDictionary)
            .override(400,400)
            .into(binding.imageDetail)
    }

    fun getDictionary(position: Int) : Dictionary? {
        var result : Dictionary? = null
        list.forEach {
            if (it.position == position) {
                result = it
            }
        }
        return result
    }

}
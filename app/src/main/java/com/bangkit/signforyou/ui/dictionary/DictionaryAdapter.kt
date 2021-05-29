package com.bangkit.signforyou.ui.dictionary

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.signforyou.data.Dictionary
import com.bangkit.signforyou.data.Feature
import com.bangkit.signforyou.databinding.ItemDictionaryBinding
import com.bangkit.signforyou.databinding.ItemFeatureBinding
import com.bangkit.signforyou.ui.dictionary.detail.DetailActivity
import com.bangkit.signforyou.ui.translation.TranslateActivity

class DictionaryAdapter : RecyclerView.Adapter<DictionaryAdapter.CourseViewHolder>() {
    private var listDictionary = ArrayList<Dictionary>()

    fun setDictionaries(dictionaries: List<Dictionary>?) {
        if (dictionaries == null) return
        this.listDictionary.clear()
        this.listDictionary.addAll(dictionaries)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val itemDictionaryBinding = ItemDictionaryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(itemDictionaryBinding)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val dictionary = listDictionary[position]
        holder.bind(dictionary)
    }

    override fun getItemCount(): Int = listDictionary.size


    class CourseViewHolder(private val binding: ItemDictionaryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(dictionary: Dictionary) {
            with(binding) {

                btn.text = dictionary.title
                btn.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.POSITION, dictionary.position)
                    itemView.context.startActivity(intent)
                }

            }
        }
    }
}
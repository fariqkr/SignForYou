package com.bangkit.signforyou.ui.main

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.signforyou.data.Feature
import com.bangkit.signforyou.databinding.ItemFeatureBinding
import com.bangkit.signforyou.ui.dictionary.DictionaryActivity
import com.bangkit.signforyou.ui.help.HelpActivity
import com.bangkit.signforyou.ui.translation.TranslateActivity
import com.bangkit.signforyou.ui.translation.camera.CameraActivity

class FeatureAdapter : RecyclerView.Adapter<FeatureAdapter.CourseViewHolder>() {
    private var listFeature = ArrayList<Feature>()

    fun setFeatures(features: List<Feature>?) {
        if (features == null) return
        this.listFeature.clear()
        this.listFeature.addAll(features)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val itemsAcademyBinding = ItemFeatureBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(itemsAcademyBinding)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = listFeature[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listFeature.size


    class CourseViewHolder(private val binding: ItemFeatureBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(feature: Feature) {
            with(binding) {
                titleFeature.text = feature.title
                detailFeature.text = feature.detail
                iconFeature.setImageResource(feature.icon)
                val sdk = android.os.Build.VERSION.SDK_INT;

                if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                    featureLayout.setBackgroundDrawable(ContextCompat.getDrawable(itemView.context, feature.background) )
                } else {
                    featureLayout.setBackground(ContextCompat.getDrawable(itemView.context, feature.background))
                }

                itemView.setOnClickListener {
                    if (titleFeature.text == "Translate") {
                        val intent = Intent(itemView.context, CameraActivity::class.java)
                        itemView.context.startActivity(intent)
                    }
                    else if (titleFeature.text == "Mini Dictionary") {
                        val intent = Intent(itemView.context, DictionaryActivity::class.java)
                        itemView.context.startActivity(intent)
                    }
                    else if (titleFeature.text == "Help") {
                        val intent = Intent(itemView.context, HelpActivity::class.java)
                        itemView.context.startActivity(intent)
                    }
                }

            }
        }
    }
}
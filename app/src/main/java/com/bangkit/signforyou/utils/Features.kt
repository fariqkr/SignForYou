package com.bangkit.signforyou.utils

import com.bangkit.signforyou.R
import com.bangkit.signforyou.data.Feature

object Features {

    fun getAllFeatures() : ArrayList<Feature> {
        val features = ArrayList<Feature>()

        features.add(
            Feature(
                "Translate",
                "Translate sign language in a real time only with your camera",
                R.drawable.feature_translation,
                R.drawable.bg_feature)
        )
        features.add(
            Feature(
            "Mini Dictionary",
            "Increase your experience in using sign language",
            R.drawable.feature_learning,
            R.drawable.bg_feature2)
        )
        features.add(
            Feature(
            "Help",
            "Guide to help you maximize using the app",
            R.drawable.feature_help,
            R.drawable.bg_feature3)
        )
        return features
    }
}
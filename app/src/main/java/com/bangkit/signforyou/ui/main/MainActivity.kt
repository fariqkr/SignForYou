package com.bangkit.signforyou.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bangkit.signforyou.R
import com.bangkit.signforyou.data.Feature
import com.bangkit.signforyou.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val features = arrayListOf(
            Feature(
                "Translate",
                "Translate sign language in a real time only with your camera",
                R.drawable.feature_translation,
                R.drawable.bg_feature
            ),
            Feature(
                "Learning",
                "Increase your experience in using sign language",
                R.drawable.feature_learning,
                R.drawable.bg_feature2
            ),
            Feature(
                "Quiz",
                "Play a quiz to see how much you understand sign language",
                R.drawable.feature_games,
                R.drawable.bg_feature3
            )
            )

        val featureAdapter = FeatureAdapter()
        featureAdapter.setFeatures(features)
        with(activityMainBinding.rvFeature) {
            this.layoutManager = LinearLayoutManager(context)
            this.setHasFixedSize(true)
            this.adapter = featureAdapter
        }
    }
}
package com.bangkit.signforyou.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bangkit.signforyou.R
import com.bangkit.signforyou.databinding.ActivityMainBinding
import com.bangkit.signforyou.utils.Features

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val featureAdapter = FeatureAdapter()
        featureAdapter.setFeatures(Features.getAllFeatures())
        with(activityMainBinding.rvFeature) {
            this.layoutManager = LinearLayoutManager(context)
            this.setHasFixedSize(true)
            this.adapter = featureAdapter
        }
    }
}
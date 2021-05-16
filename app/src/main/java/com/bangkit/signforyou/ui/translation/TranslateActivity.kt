package com.bangkit.signforyou.ui.translation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.signforyou.R
import com.bangkit.signforyou.databinding.ActivityTranslateBinding

class TranslateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translate)
        val activityTranslateBinding = ActivityTranslateBinding.inflate(layoutInflater)
        setContentView(activityTranslateBinding.root)
    }
}
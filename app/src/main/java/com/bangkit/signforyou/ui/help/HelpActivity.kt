package com.bangkit.signforyou.ui.help

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.signforyou.databinding.ActivityHelpBinding
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityHelpBinding = ActivityHelpBinding.inflate(layoutInflater)
        setContentView(activityHelpBinding.root)




    }
}
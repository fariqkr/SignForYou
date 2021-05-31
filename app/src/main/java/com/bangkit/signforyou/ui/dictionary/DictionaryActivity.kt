package com.bangkit.signforyou.ui.dictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.signforyou.R
import com.bangkit.signforyou.databinding.ActivityDictionaryBinding
import com.bangkit.signforyou.utils.Dictionaries
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexWrap
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent

class DictionaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDictionaryBinding = ActivityDictionaryBinding.inflate(layoutInflater)
        setContentView(activityDictionaryBinding.root)

        val dictionaries = Dictionaries.getAllDictionary()
        val dictionaryAdapter = DictionaryAdapter()
        dictionaryAdapter.setDictionaries(dictionaries)
        with(activityDictionaryBinding.rvAlphabet) {
            val mLayoutManager = FlexboxLayoutManager(this@DictionaryActivity)
            mLayoutManager.flexDirection = FlexDirection.ROW
            mLayoutManager.flexWrap = FlexWrap.WRAP
            mLayoutManager.justifyContent = JustifyContent.SPACE_AROUND
            this.layoutManager = mLayoutManager
            this.setHasFixedSize(true)
            this.adapter = dictionaryAdapter
        }
    }
}
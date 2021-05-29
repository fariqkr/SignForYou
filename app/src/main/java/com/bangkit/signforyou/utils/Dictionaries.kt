package com.bangkit.signforyou.utils

import com.bangkit.signforyou.data.Dictionary

object Dictionaries {
    fun getAllDictionary() : ArrayList<Dictionary> {
        val dictionaries = ArrayList<Dictionary>()
        dictionaries.add(
            Dictionary("A", "", 1)
        )
        dictionaries.add(
            Dictionary("B", "", 2)
        )
        return dictionaries
    }
}
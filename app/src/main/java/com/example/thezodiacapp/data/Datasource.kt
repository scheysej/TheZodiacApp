package com.example.thezodiacapp.data

import com.example.thezodiacapp.R
import com.example.thezodiacapp.model.Zodiac

class Datasource {
    fun loadZodiacs(): List<Zodiac>{
        return listOf<Zodiac>(
            Zodiac(R.string.taurusRef),
            Zodiac(R.string.geminiRef),
            Zodiac(R.string.cancerRef),
            Zodiac(R.string.leoRef),
            Zodiac(R.string.virgoRef),
            Zodiac(R.string.libraRef),
            Zodiac(R.string.scorpioRef),
            Zodiac(R.string.sagittariusRef),
            Zodiac(R.string.capricornRef),
            Zodiac(R.string.aquariusRef),
            Zodiac(R.string.ariesRef),
            Zodiac(R.string.piscesRef),
        )

    }
}
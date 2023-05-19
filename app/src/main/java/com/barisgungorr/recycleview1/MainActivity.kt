package com.barisgungorr.recycleview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.barisgungorr.LandMark
import com.barisgungorr.recycleview1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var landMarkList : ArrayList<LandMark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landMarkList = ArrayList<LandMark> ()

        val pisa = LandMark("Pisa","Italy",R.drawable.pisa)
        val coloseum = LandMark("Coloseum","Italy",R.drawable.collosseum)
        val eifel = LandMark("Eiffel","France",R.drawable.eyfel)
        val londonBridge = LandMark("London Bridge","Uk",R.drawable.londo)

        landMarkList.add(pisa)
        landMarkList.add(coloseum)
        landMarkList.add(eifel)
        landMarkList.add(londonBridge)



    }
}
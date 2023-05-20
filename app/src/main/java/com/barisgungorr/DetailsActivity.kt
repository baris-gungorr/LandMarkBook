package com.barisgungorr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.barisgungorr.recycleview1.R
import com.barisgungorr.recycleview1.databinding.ActivityDetailsBinding
import com.barisgungorr.recycleview1.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

     //   val selectedLandmark = intent.getSerializableExtra("landmark") as LandMark
       val selectedLandmark = MySingleton.choseLandMark
        binding.nameText.text = selectedLandmark?.name
        binding.countryText.text = selectedLandmark?.country
        binding.imageView.setImageResource(selectedLandmark!!.image)




    }
}
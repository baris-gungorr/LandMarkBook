package com.barisgungorr.recycleview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.barisgungorr.LandMark
import com.barisgungorr.LandMarkAdapter
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

        val pisa = LandMark("Pisa","Italy",R.drawable.pisa,"Pisa Kulesi, İtalya'nın kuzeyindeki Pisa şehrinde Piazza dei Miracoli'de yer alan ve 1063-1090 yıllarında yapılan şehir katedralinin çan kulesi, ana yapıdan ayrı olarak 1173-1272 yılları arasında yapıldı.")
        val coloseum = LandMark("Coloseum","Italy",R.drawable.collosseum,"Kolezyum ya da Flavianus Amfitiyatrosu, İtalya'nın başkenti Roma'da bulunan oval bir amfitiyatrodur. Usta bir komutan olan Vespasianus tarafından M.S. 72 yılında yapımına başlanıp M.S. 80 yılında Titus döneminde tamamlandı. Daha sonraki değişiklikler Domitian hükümdarlığı zamanında yapıldı")
        val eifel = LandMark("Eiffel","France",R.drawable.eyfel,"Eyfel Kulesi, Paris'teki demir kule. Kule, aynı zamanda tüm dünyada Fransa'nın sembolü halini almıştır. İsmini, inşa ettiren Fransız mimar Gustave Eiffel'den alır. En büyük turizm cazibelerinden biri olan Eyfel Kulesi, yılda 6 milyon turist çeker. 2002 yılında toplam ziyaretçi sayısı 200 milyona ulaşmıştır")
        val londonBridge = LandMark("London Bridge","Uk",R.drawable.londo,"Londra Köprüsü, Birleşik Krallık'ın başkenti Londra'da Thames Nehri üzerinde bulunan bir köprüdür. Şehir merkezi ile Southwark semti arasında yer alır. 1750 yılına kadar Thames'in üzerindeki tek köprü olmuştur. Köprünün kuzey bitiminde Büyük Londra Yangını'nın anısına dikilmiş The Monument bulunmaktadır.")

        landMarkList.add(pisa)
        landMarkList.add(coloseum)
        landMarkList.add(eifel)
        landMarkList.add(londonBridge)

        //Adapter (Layout ile datayı birbirine bağlar

        binding.RecyclerView.layoutManager = LinearLayoutManager(this)
        val landMarkAdapter = LandMarkAdapter(landMarkList)
        binding.RecyclerView.adapter = landMarkAdapter






    }
}
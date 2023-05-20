package com.barisgungorr

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.barisgungorr.recycleview1.databinding.RecyclerRowBinding

class LandMarkAdapter(val landMarkList: ArrayList<LandMark>) : RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder>() {

    class LandMarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarkHolder { // viewHolder ilk oluşturulduğunda ne olacak bunu söylüyoruz
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)// recycleRow'u burada bağlıyoruz
        return LandMarkHolder(binding)
    }

    override fun getItemCount(): Int {  // Kaç adet oluşturacağımızı söylüyoruz
        return landMarkList.size
    }

    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) { //bağlandıktan sonra ne olacak yani hangiText'te ne yazılacak gibi
        holder.binding.RecyclerViewTextView.text = landMarkList.get(position).name
        holder.itemView.setOnClickListener {
            val intent =  Intent(holder.itemView.context,DetailsActivity::class.java)
          //  intent.putExtra("landmark",landMarkList.get(position))
            holder.itemView.context.startActivity(intent)
            MySingleton.choseLandMark = landMarkList.get(position)

        }

    }


}
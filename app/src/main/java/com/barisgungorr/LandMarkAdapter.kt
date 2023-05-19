package com.barisgungorr

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.barisgungorr.recycleview1.databinding.RecyclerRowBinding

class LandMarkAdapter(val landMarkList: ArrayList<LandMark>) : RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder>() {

    class LandMarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandMarkHolder(binding)
    }

    override fun getItemCount(): Int {
        return landMarkList.size
    }

    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) {
        holder.binding.RecyclerViewTextView.text = landMarkList.get(position).name
    }


}
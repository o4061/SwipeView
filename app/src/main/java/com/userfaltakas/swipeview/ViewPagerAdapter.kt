package com.userfaltakas.swipeview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.userfaltakas.swipeview.databinding.ItemViewPagerBinding

class ViewPagerAdapter(
    val text: List<String>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(val binding: ItemViewPagerBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        return ViewPagerViewHolder(
            ItemViewPagerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        var curText = text[position]
        val binding = holder.binding

        holder.itemView.apply {
            binding.textView.text = curText
        }
    }

    override fun getItemCount(): Int {
        return text.size
    }
}
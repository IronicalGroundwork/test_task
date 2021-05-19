package com.ironical_groundwork.test_task.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ironical_groundwork.test_task.R
import com.ironical_groundwork.test_task.models.GalleryList
import com.ironical_groundwork.test_task.models.PlayersList
import com.squareup.picasso.Picasso
import java.util.*

class GalleryAdapter: RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {
    private val mGalleryList: MutableList<GalleryList> = LinkedList()

    fun setData(newImg: List<GalleryList>){
        mGalleryList.clear()
        mGalleryList.addAll(newImg)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.gallery_list_item, viewGroup, false))
    }

    override fun getItemCount(): Int {
        return mGalleryList.count()
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(model = mGalleryList[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val img: ImageView = itemView.findViewById(R.id.img)

        @SuppressLint("SetTextI18n")
        fun bind(model: GalleryList) {

            Picasso.with(itemView.context).load(model.img).into(img)

        }
    }
}
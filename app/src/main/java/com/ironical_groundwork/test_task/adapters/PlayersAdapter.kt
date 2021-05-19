package com.ironical_groundwork.test_task.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ironical_groundwork.test_task.R
import com.ironical_groundwork.test_task.models.PlayersList
import com.squareup.picasso.Picasso
import java.util.*

class PlayersAdapter: RecyclerView.Adapter<PlayersAdapter.ViewHolder>() {
    private val mPlayersList: MutableList<PlayersList> = LinkedList()

    fun setData(newPlayer: List<PlayersList>){
        mPlayersList.clear()
        mPlayersList.addAll(newPlayer)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.players_list_item, viewGroup, false))
    }

    override fun getItemCount(): Int {
        return mPlayersList.count()
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(model = mPlayersList[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val img: ImageView = itemView.findViewById(R.id.player_img)
        private val name: TextView = itemView.findViewById(R.id.players_name)
        private val sport: TextView = itemView.findViewById(R.id.player_sport)

        @SuppressLint("SetTextI18n")
        fun bind(model: PlayersList) {

            Picasso.with(itemView.context).load(model.player_img).into(img)

            name.text = model.player_id.toString() + ". " + model.player_name
            sport.text = model.player_sport
        }
    }
}
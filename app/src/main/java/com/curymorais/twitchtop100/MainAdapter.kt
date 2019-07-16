package com.curymorais.twitchtop100

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curymorais.twitchtop100.data.domain.Game
import com.curymorais.twitchtop100.data.domain.GameDetail
import com.squareup.picasso.Picasso
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_row_game.*

class MainAdapter : RecyclerView.Adapter<MainAdapter.GameHolder>() {

    private var gameList : ArrayList<Game> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameHolder {
        return GameHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row_game, parent, false))
//        return GameHolder(inflate(parent.context, R.layout.item_row_game, false))
    }

    override fun getItemCount(): Int {
       return gameList.size
    }

    override fun onBindViewHolder(holder: GameHolder, position: Int) {
        holder.bind(gameList[position].gameDetail)
    }

    class GameHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bind(gameDetail: GameDetail){
            Picasso.get().load(gameDetail.boxImages.large).into(game_image)
            game_name.text = gameDetail.name
            game_description.text =  gameDetail.popularity.toString()
        }
    }

    fun updateList(gameList: ArrayList<Game>){
        this.gameList = gameList
    }
}
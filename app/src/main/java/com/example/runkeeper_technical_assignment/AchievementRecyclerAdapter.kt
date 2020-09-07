package com.example.runkeeper_technical_assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.runkeeper_technical_assignment.model.Achievement
import kotlinx.android.synthetic.main.achievement_tile.view.*
import kotlin.collections.ArrayList

class AchievementRecyclerAdapter :  RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    //set up a list of Achievements
    private var items: List<Achievement> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AchievementViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.achievement_tile, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is AchievementViewHolder -> {
                holder.bind(items[position])
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(achievementList: List<Achievement>){
        items = achievementList
    }

    class AchievementViewHolder
    constructor(
            itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val achievement_title = itemView.achievemnt_title
        val achievement_subTitle = itemView.achievemnt_subtitle
        val achievement_image = itemView.achievement_image
//        val achievement_isObtained = itemView.blog_author

        fun bind(achievementTile: Achievement){

            val requestOptions = RequestOptions()
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                    .applyDefaultRequestOptions(requestOptions)
                    .load(achievementTile.image)
                    .into(achievement_image)
            achievement_title.setText(achievementTile.title)
            achievement_subTitle.setText(achievementTile.subTitle)

        }
    }

}
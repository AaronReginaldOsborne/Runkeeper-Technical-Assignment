package com.example.runkeeper_technical_assignment

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.runkeeper_technical_assignment.model.Achievement
import kotlinx.android.synthetic.main.achievement_tile.view.*
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size
import kotlin.collections.ArrayList

class AchievementRecyclerAdapter :  RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    //set up a list of Achievements
    private var items: List<Achievement> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AchievementViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.achievement_tile, parent, false),
                items
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
            itemView: View,
            items: List<Achievement> = ArrayList()
    ): RecyclerView.ViewHolder(itemView){
        val achievement_title = itemView.achievemnt_title
        val achievement_subTitle = itemView.achievemnt_subtitle
        val achievement_image = itemView.achievement_image
        init {
            itemView.setOnClickListener {v: View->
                val position:Int = adapterPosition

                //disable pop up if not obtained
                if(items[position].isObtained)
                    CustomAchievementModal(v.context, items[position]).show()
            }
        }

        fun bind(achievement: Achievement){

            val requestOptions = RequestOptions()
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                    .applyDefaultRequestOptions(requestOptions)
                    .load(achievement.image)
                    .into(achievement_image)

            achievement_title.text = achievement.title
            achievement_subTitle.text = achievement.subTitle

            //change color if disabled
            if(!achievement.isObtained)
                achievement_image.alpha = 0.5f
        }
    }

}
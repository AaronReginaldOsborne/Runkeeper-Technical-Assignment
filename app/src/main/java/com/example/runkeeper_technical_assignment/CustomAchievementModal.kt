package com.example.runkeeper_technical_assignment

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.runkeeper_technical_assignment.model.Achievement
import kotlinx.android.synthetic.main.achievement_modal.*
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size

class CustomAchievementModal (context: Context, mAchievement: Achievement) : Dialog(context) {

    private var achievement: Achievement = mAchievement
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_ACTION_BAR)
        setContentView(R.layout.achievement_modal)

        //fix corners
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))


        popupTitle.text = achievement.title
        popupBody.text = achievement.subTitle
        Glide.with(context)
                .load(achievement.image)
                .into(popupImg)

        viewKonfetti.build()
        .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
        .setDirection(0.0, 359.0)
        .setSpeed(1f, 5f)
        .setFadeOutEnabled(true)
        .setTimeToLive(2000L)
        .addShapes(Shape.Square, Shape.Circle)
        .addSizes(Size(12))
        .setPosition(250f, 200f)
        .streamFor(500, 300L)

        // set on-click listener
        findViewById<Button>(R.id.popupBtn).setOnClickListener {
            dismiss()
        }
    }
}
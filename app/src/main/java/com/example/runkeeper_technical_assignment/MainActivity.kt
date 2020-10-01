package com.example.runkeeper_technical_assignment

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //late init means it will be initialized later ?=null without it
    private lateinit var achievementAdapter: AchievementRecyclerAdapter
    private lateinit var virtualRaceAdapter: AchievementRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //change app bar name
        this.title = resources.getString(R.string.achievements)
        initRecyclerView()
        addDataSets()
    }

    private fun addDataSets(){
        val data1 = DataSource.createDataSet1()
        achievementAdapter.submitList(data1)
        val data2 = DataSource.createDataSet2()
        virtualRaceAdapter.submitList(data2)
    }

    private fun initRecyclerView(){

        val orientation = resources.configuration.orientation
        val numRows = if (orientation == Configuration.ORIENTATION_LANDSCAPE)
            3
        else
            2

        // apply just refers to achievementList
        achievementList.apply {
            layoutManager = GridLayoutManager(this@MainActivity, numRows, GridLayoutManager.VERTICAL, false)
            achievementAdapter = AchievementRecyclerAdapter()
            adapter = achievementAdapter
        }
        // code without apply
        // achivementList.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        // achievementAdapter = AchievementRecyclerAdapter()
        // achivementList.adapter = achievementAdapter

        virtualRaceList.apply {
            layoutManager = GridLayoutManager(this@MainActivity, numRows, GridLayoutManager.VERTICAL, false)
            virtualRaceAdapter = AchievementRecyclerAdapter()
            adapter = virtualRaceAdapter
        }

    }
}
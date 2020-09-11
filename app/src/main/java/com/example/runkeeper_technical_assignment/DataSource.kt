package com.example.runkeeper_technical_assignment
import com.example.runkeeper_technical_assignment.model.Achievement

class DataSource {
    companion object{
        fun createDataSet1(): ArrayList<Achievement>{
            val list = ArrayList<Achievement>()
            list.add(
                    Achievement(
                            "Longest Run",
                            "00:00",
                            R.mipmap.ic_achievement_1,
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Highest Elevation",
                            "00:00",
                            R.mipmap.ic_achievement_2,
                            true
                    )
            )

            list.add(
                    Achievement(
                            "Fastest 5k",
                            "00:00",
                            R.mipmap.ic_achievement_3,
                            true
                    )
            )
            list.add(
                    Achievement(
                            "10k",
                            "00:00",
                            R.mipmap.ic_achievement_4,
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Half Marathon",
                            "00:00",
                            R.mipmap.ic_achievement_5,
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Marathon",
                            "00:00",
                            R.mipmap.ic_achievement_6,
                            true
                    )
            )
            return list
        }

        fun createDataSet2(): ArrayList<Achievement>{
            val list = ArrayList<Achievement>()
            list.add(
                    Achievement(
                            "Virtual Half Marathon Race!",
                            "00:00",
                            R.mipmap.ic_achievement_7,
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Tokyo-Hakone Ekiden 2020",
                            "00:00:00",
                            R.mipmap.ic_achievement_8,
                            true
                    )
            )

            list.add(
                    Achievement(
                            "Virtual 10k Race",
                            "00:00:00",
                            R.mipmap.ic_achievement_9,
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Hakone Ekiden",
                            "00:00:00",
                            R.mipmap.ic_achievement_10,
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Mizuno Singapore Ekiden 2015",
                            "00:00:00",
                            R.mipmap.ic_achievement_11,
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Virtual 5K Race",
                            "23:07",
                            R.mipmap.ic_achievement_12,
                            true
                    )
            )
            return list
        }
    }
}
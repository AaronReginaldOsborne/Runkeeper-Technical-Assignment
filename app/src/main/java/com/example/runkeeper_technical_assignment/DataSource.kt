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
                            "https://imgur.com/Xm7hS5u.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Highest Elevation",
                            "00:00",
                            "https://imgur.com/FmRA85t.png",
                            true
                    )
            )

            list.add(
                    Achievement(
                            "Fastest 5k",
                            "00:00",
                            "https://imgur.com/gWNWMpU.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "10k",
                            "00:00",
                            "https://imgur.com/gqCqeun.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Half Marathon",
                            "00:00",
                            "https://imgur.com/83LHqtR.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Marathon",
                            "00:00",
                            "https://imgur.com/WRAVrA2.png",
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
                             "https://imgur.com/z56arbx.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Tokyo-Hakone Ekiden 2020",
                            "00:00:00",
                            "https://imgur.com/0cQvUdY.png",
                            true
                    )
            )

            list.add(
                    Achievement(
                            "Virtual 10k Race",
                            "00:00:00",
                            "https://imgur.com/KAq7eDt.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Hakone Ekiden",
                            "00:00:00",
                            "https://imgur.com/0YQRMu4.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Mizuno Singapore Ekiden 2015",
                            "00:00:00",
                            "https://imgur.com/6XqaHF3.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Virtual 5K Race",
                            "23:07",
                            "https://imgur.com/pPRHsiy.png",
                            true
                    )
            )
            return list
        }
    }
}
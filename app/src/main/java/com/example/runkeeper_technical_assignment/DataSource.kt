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
                            "https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/trailhead_basics/11592ff48bc3b35bcd9945e6bde11319_badge.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Highest Elevation",
                            "00:00",
                            "https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/trailhead_playground_management/2f5d5c1bfd282031b928027dc61ae51e_badge.png",
                            true
                    )
            )

            list.add(
                    Achievement(
                            "Fastest 5k",
                            "00:00",
                            "https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/sales-cloud-platform-quick-look/b91b2499486a772a4eee8ce55aa32b57_badge.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "10k",
                            "00:00",
                            "https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/accessibility-basics/9cb082ff8941482adea328d195ad6ca0_badge.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Half Marathon",
                            "00:00",
                            "https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/resume-strategies/c90003d66c34207f70b911842b37c469_badge.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Marathon",
                            "00:00",
                            "https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/pw-api-basics/0a592c1a1e99a0695cd811499a801eef_badge.png",
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
                            "https://trailhead.salesforce.com/assets/ranks/scout-08d5a892fdc8141b41f532d89f1c5d50441e986ae5a94fb44c2d9a8780367653.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Tokyo-Hakone Ekiden 2020",
                            "00:00:00",
                            "https://trailhead.salesforce.com/assets/ranks/hiker-7b79e02ebdc7b09c5b79c97958c5e554d6609bee9f37598f9deeb5896a9c7105.png",
                            true
                    )
            )

            list.add(
                    Achievement(
                            "Virtual 10k Race",
                            "00:00:00",
                            "https://trailhead.salesforce.com/assets/ranks/explorer-e43e2a6fc4d869bf9c2990c5a2c265678c45d1a2fd90e7b89010869d0b63798d.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Hakone Ekiden",
                            "00:00:00",
                            "https://trailhead.salesforce.com/assets/ranks/adventurer-b26177109714fa42d5df7c792e28f39696a6f5ce7ff7464dd27c48bd56e2a94b.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Mizuno Singapore Ekiden 2015",
                            "00:00:00",
                            "https://trailhead.salesforce.com/assets/ranks/mountaineer-121da937d748d9978cc681de9e6d968486ec25ab8a26ddd42a6c50a2c418ea7e.png",
                            true
                    )
            )
            list.add(
                    Achievement(
                            "Virtual 5K Race",
                            "23:07",
                            "https://trailhead.salesforce.com/assets/ranks/expeditioner-f2c1a62ba3ce2395efbffdb4df00942a7e55d7da12e73b02805a03c05395bd73.png",
                            true
                    )
            )
            return list
        }
    }
}
package com.example.runkeeper_technical_assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView achievementList;
    RecyclerView virtualRaceList;

    ArrayList<String> names;
    ArrayList<String> description;
    ArrayList<String> images;

    ArrayList<String> names2;
    ArrayList<String> description2;
    ArrayList<String> images2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //change app bar name
        this.setTitle(getResources().getString(R.string.achievements));

        achievementList = findViewById(R.id.achivementList);

        names = new ArrayList<>();
        description = new ArrayList<>();
        images = new ArrayList<>();

        names.add("Longest Run");
        names.add("Highest Elevation");
        names.add("Fastest 5k");
        names.add("10k");
        names.add("Half Marathon");
        names.add("Marathon");

        description.add("00:00");
        description.add("00:00");
        description.add("00:00");
        description.add("00:00");
        description.add("00:00");
        description.add("00:00");

        images.add("https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/trailhead_basics/11592ff48bc3b35bcd9945e6bde11319_badge.png");
        images.add("https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/trailhead_playground_management/2f5d5c1bfd282031b928027dc61ae51e_badge.png");
        images.add("https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/sales-cloud-platform-quick-look/b91b2499486a772a4eee8ce55aa32b57_badge.png");
        images.add("https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/accessibility-basics/9cb082ff8941482adea328d195ad6ca0_badge.png");
        images.add("https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/resume-strategies/c90003d66c34207f70b911842b37c469_badge.png");
        images.add("https://res.cloudinary.com/hy4kyit2a/f_auto,fl_lossy,q_70/learn/modules/pw-api-basics/0a592c1a1e99a0695cd811499a801eef_badge.png");


        Adapter adapter = new Adapter(this, names,images,description);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        achievementList.setLayoutManager(gridLayoutManager);
        achievementList.setAdapter(adapter);

        virtualRaceList = findViewById(R.id.virtualRaceList);

        names2 = new ArrayList<>();
        description2 = new ArrayList<>();
        images2 = new ArrayList<>();

        names2.add("Virtual Half Marathon Race");
        names2.add("Tokyo-Hakone Ekiden 2020");
        names2.add("Virtual 10k Race");
        names2.add("Hakone Ekiden");
        names2.add("Mizuno Singapore Ekiden 2015");
        names2.add("Virtual 5K Race");

        description2.add("00:00");
        description2.add("00:00:00");
        description2.add("00:00:00");
        description2.add("00:00:00");
        description2.add("00:00:00");
        description2.add("23:07");

        images2.add("https://trailhead.salesforce.com/assets/ranks/scout-08d5a892fdc8141b41f532d89f1c5d50441e986ae5a94fb44c2d9a8780367653.png");
        images2.add("https://trailhead.salesforce.com/assets/ranks/hiker-7b79e02ebdc7b09c5b79c97958c5e554d6609bee9f37598f9deeb5896a9c7105.png");
        images2.add("https://trailhead.salesforce.com/assets/ranks/explorer-e43e2a6fc4d869bf9c2990c5a2c265678c45d1a2fd90e7b89010869d0b63798d.png");
        images2.add("https://trailhead.salesforce.com/assets/ranks/adventurer-b26177109714fa42d5df7c792e28f39696a6f5ce7ff7464dd27c48bd56e2a94b.png");
        images2.add("https://trailhead.salesforce.com/assets/ranks/mountaineer-121da937d748d9978cc681de9e6d968486ec25ab8a26ddd42a6c50a2c418ea7e.png");
        images2.add("https://trailhead.salesforce.com/assets/ranks/expeditioner-f2c1a62ba3ce2395efbffdb4df00942a7e55d7da12e73b02805a03c05395bd73.png");

        Adapter adapter2 = new Adapter(this, names2,images2,description2);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        virtualRaceList.setLayoutManager(gridLayoutManager2);
        virtualRaceList.setAdapter(adapter2);
    }
}
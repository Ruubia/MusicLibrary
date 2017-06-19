/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.bea.musiclibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        // Find the View that shows the music category
        TextView music = (TextView)findViewById(R.id.music);

        //Set a clickListener on that View
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Create a new  intent to open the {@link MusicActmivity}
                Intent musicIntent = new Intent(MainActivity.this,MusicActivity.class);

                //Start the new activity
                startActivity(musicIntent);
            }
        });
        // Find the View that shows the video category
        TextView video = (TextView)findViewById(R.id.video);

        //Set a clickListener on that View
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Create a new  intent to open the {@link VideoActmivity}
                Intent videoIntent = new Intent(MainActivity.this,VideoActivity.class);

                //Start the new activity
                startActivity(videoIntent);
            }
        });
        // Find the View that shows the setting category
        TextView setting = (TextView)findViewById(R.id.setting);

        //Set a clickListener on that View
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Create a new  intent to open the {@link SettingActmivity}
                Intent settingIntent = new Intent(MainActivity.this,SettingActivity.class);

                //Start the new activity
                startActivity(settingIntent);
            }
        });
        // Find the View that shows the podcasts category
        TextView podcasts = (TextView)findViewById(R.id.podcasts);

        //Set a clickListener on that View
        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Create a new  intent to open the {@link PodcastsActivity}
                Intent podcastsIntent = new Intent(MainActivity.this,PodcastsActivity.class);

                //Start the new activity
                startActivity(podcastsIntent);
            }
        });
    }

}

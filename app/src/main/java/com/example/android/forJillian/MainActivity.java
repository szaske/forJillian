package com.example.android.forJillian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import android.media.MediaPlayer;
import android.view.View;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Declaring our variables
    private ImageView dallasView;
    MediaPlayer purr;
    MediaPlayer meow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        purr = MediaPlayer.create(this, R.raw.purr);
        meow = MediaPlayer.create(this, R.raw.meow);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the ImageView
        dallasView = (ImageView) findViewById(R.id.imageView);

        //Loading Image from URL
        Picasso.with(this)
                .load(R.drawable.dal)
                .into(dallasView);


        dallasView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int i1 = r.nextInt(2) + 1;

                if (i1 == 2){
                    meow.seekTo(0);
                    meow.start();
                }
                else {
                    purr.seekTo(0);
                    purr.start();

                }


            }
        });

    }
}

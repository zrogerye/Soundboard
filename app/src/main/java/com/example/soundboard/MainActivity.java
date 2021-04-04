package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bruh
        final MediaPlayer bruhPlayer = MediaPlayer.create(this, R.raw.bruh);
        Button bruhButton = (Button) this.findViewById(R.id.bruhButton);
        bruhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer.create(MainActivity.this, R.raw.bruh).start();
                bruhPlayer.seekTo(0);
                bruhPlayer.start();
            }
        });

        //yeah
        final MediaPlayer yeahPlayer = MediaPlayer.create(this, R.raw.yeah);
        Button yeahButton = (Button) this.findViewById(R.id.yeahButton);
        yeahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer.create(MainActivity.this, R.raw.yeah).start();
                yeahPlayer.seekTo(0);
                yeahPlayer.start();
            }
        });

        //shit
        final MediaPlayer shitPlayer = MediaPlayer.create(this, R.raw.poop);
        final Button shitButton = (Button) this.findViewById(R.id.shitButton);
        shitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer.create(MainActivity.this, R.raw.poop).start();
                shitPlayer.seekTo(0);
                shitPlayer.start();
            }
        });

        //stop
        /*Button stopButton = (Button) this.findViewById(R.id.stopButton);
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //shitPlayer.seekTo(0);
                shitPlayer.stop();

                //yeahPlayer.seekTo(0);
                yeahPlayer.stop();

                //bruhPlayer.seekTo(0);
                bruhPlayer.stop();

            }
        });*/



    }
}
package com.musica.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nowPlay = (TextView)findViewById(R.id.nowPlaying);

        nowPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Now_Playing.class);
                startActivity(i);
            }
        });

        TextView track = (TextView)findViewById(R.id.tracks);

        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,Tracks.class);
                startActivity(in);
            }
        });

        TextView playlist = (TextView)findViewById(R.id.playlists);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(MainActivity.this,Playlists.class);
                startActivity(inte);
            }
        });
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(new MySurfaceView(this));
        findViewById(R.id.Player);
        findViewById(R.id.right);
        findViewById(R.id.left);
        findViewById(R.id.up);
        findViewById(R.id.down);



    }

    public void Right(View view) {
        System.out.println(player.x + " " + player.y);
    }


}
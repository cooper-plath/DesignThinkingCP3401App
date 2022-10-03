package com.example.designthinkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class Camera extends AppCompatActivity {

    Button btnCamPhoto;
    Button btnCamVideo;
    Button btnViewPhotos;
    Button btnViewVideos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        btnCamVideo = (Button) findViewById(R.id.btnCameraVideo);

        btnCamPhoto = (Button) findViewById(R.id.btnCameraPhoto);

        btnViewPhotos = (Button) findViewById(R.id.btnViewPhotos);

        btnViewVideos = (Button) findViewById(R.id.btnViewVideos);

        btnCamPhoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                    startActivity(intent);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        btnCamVideo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
                    startActivity(intent);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });

        btnViewPhotos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(MediaStore.INTENT_ACTION_VIDEO_PLAY_FROM_SEARCH);
                    startActivity(intent);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });

    }

}
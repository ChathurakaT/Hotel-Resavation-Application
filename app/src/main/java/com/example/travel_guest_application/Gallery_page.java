package com.example.travel_guest_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Gallery_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_page);

        // Find the VideoView by its id
        VideoView videoView = findViewById(R.id.videoView);

        // Set the video path to play a video from the raw folder
        videoView.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.video);
        // Start playing the video
        videoView.start();

        // Create a media controller and set it as the anchor view for the VideoView
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        // Set the media controller for the VideoView
        videoView.setMediaController(mediaController);
    }
}
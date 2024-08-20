package com.example.videoviewdemo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    private lateinit var videoView: VideoView
    private lateinit var mediaController: MediaController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the VideoView in the layout
        videoView = findViewById(R.id.videoView)

        // Create a MediaController
        mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        // Set the MediaController for the VideoView
        videoView.setMediaController(mediaController)

        // Set up the video to play
        setupVideo()
    }

    private fun setupVideo() {
        // Option 1: Play a local video file
        val videoPath = "android.resource://${packageName}/${R.raw.sample_video}"
        videoView.setVideoURI(Uri.parse(videoPath))

        // Option 2: Play a remote video file (uncomment to use)
        // val videoUrl = "https://example.com/sample_video.mp4"
        // videoView.setVideoURI(Uri.parse(videoUrl))

        // Start playing the video
        videoView.start()
    }

    override fun onResume() {
        super.onResume()
        videoView.resume()
    }

    override fun onPause() {
        super.onPause()
        videoView.suspend()
    }

    override fun onDestroy() {
        super.onDestroy()
        videoView.stopPlayback()
    }
}

package com.example.textureviewdemo

import android.graphics.SurfaceTexture
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation

class MainActivity : AppCompatActivity(), TextureView.SurfaceTextureListener {

    private lateinit var textureView: TextureView
    private val paint = Paint()
    private var centerX = 0f
    private var centerY = 0f
    private var radius = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textureView = findViewById(R.id.textureView)
        textureView.surfaceTextureListener = this

        paint.color = Color.BLUE
        paint.style = Paint.Style.FILL

        // Set up rotation animation
        val rotateAnimation = RotateAnimation(
            0f, 360f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        ).apply {
            duration = 3000
            repeatCount = Animation.INFINITE
            interpolator = LinearInterpolator()
        }

        textureView.startAnimation(rotateAnimation)
    }

    override fun onSurfaceTextureAvailable(surface: SurfaceTexture, width: Int, height: Int) {
        centerX = width / 2f
        centerY = height / 2f
        radius = width.coerceAtMost(height) / 4f
        drawCircle()
    }

    override fun onSurfaceTextureSizeChanged(surface: SurfaceTexture, width: Int, height: Int) {
        centerX = width / 2f
        centerY = height / 2f
        radius = width.coerceAtMost(height) / 4f
        drawCircle()
    }

    override fun onSurfaceTextureDestroyed(surface: SurfaceTexture): Boolean {
        return true
    }

    override fun onSurfaceTextureUpdated(surface: SurfaceTexture) {
        // This method is called whenever the texture is updated
    }

    private fun drawCircle() {
        val canvas = textureView.lockCanvas()
        canvas?.let {
            it.drawColor(Color.WHITE)
            it.drawCircle(centerX, centerY, radius, paint)
            textureView.unlockCanvasAndPost(it)
        }
    }
}

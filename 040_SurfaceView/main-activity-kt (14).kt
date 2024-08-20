package com.example.surfaceviewdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.view.SurfaceHolder
import android.view.SurfaceView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(BouncingBallView(this))
    }

    private inner class BouncingBallView(context: Context) : SurfaceView(context), Runnable {
        private var thread: Thread? = null
        private var isRunning = false
        private val surfaceHolder: SurfaceHolder = holder
        private val paint: Paint = Paint()
        private var cx = 100f
        private var cy = 100f
        private var dx = 5f
        private var dy = 5f
        private val radius = 50f

        init {
            paint.color = Color.BLUE
        }

        fun resume() {
            isRunning = true
            thread = Thread(this)
            thread?.start()
        }

        fun pause() {
            isRunning = false
            thread?.join()
        }

        override fun run() {
            while (isRunning) {
                update()
                draw()
                control()
            }
        }

        private fun update() {
            if (cx + radius > width || cx - radius < 0) dx *= -1
            if (cy + radius > height || cy - radius < 0) dy *= -1
            cx += dx
            cy += dy
        }

        private fun draw() {
            if (surfaceHolder.surface.isValid) {
                val canvas: Canvas = surfaceHolder.lockCanvas()
                canvas.drawColor(Color.WHITE)
                canvas.drawCircle(cx, cy, radius, paint)
                surfaceHolder.unlockCanvasAndPost(canvas)
            }
        }

        private fun control() {
            Thread.sleep(17) // ~60 FPS
        }
    }

    override fun onResume() {
        super.onResume()
        (findViewById<SurfaceView>(android.R.id.content) as BouncingBallView).resume()
    }

    override fun onPause() {
        super.onPause()
        (findViewById<SurfaceView>(android.R.id.content) as BouncingBallView).pause()
    }
}

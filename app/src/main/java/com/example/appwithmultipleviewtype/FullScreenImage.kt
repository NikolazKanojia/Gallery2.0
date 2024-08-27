package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.appwithmultipleviewtype.R
import kotlin.math.abs

class FullScreenImage : AppCompatActivity(), GestureDetector.OnGestureListener {
    public lateinit var fullimage: ImageView
    lateinit var animation: Animation
    lateinit var gesturedector: GestureDetector
    var x2: Float = 0.0f
    var x1: Float = 0.0f
    var y1: Float = 0.0f
    var y2: Float = 0.0f
    var isLiked: Boolean = true

    companion object {
        const val Min_distance = 150
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_screen_image)
        animation = AnimationUtils.loadAnimation(applicationContext, android.R.anim.fade_out)
        fullimage = findViewById<ImageView>(R.id.ImageViewFullScreen)
        val likebutton = findViewById<ImageView>(R.id.likebutton)
        likebutton.setOnClickListener {
            if (isLiked) {
                likebutton.setImageResource(R.drawable.like1)
                isLiked = false
            } else {
                likebutton.setImageResource(R.drawable.like)
                isLiked = true
            }
        }
        val imageUrl = intent.getStringExtra("url").toString()
        Glide.with(applicationContext)
            .load(imageUrl)
            .error(R.drawable.dog)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(fullimage)

        gesturedector = GestureDetector(this, this)
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        gesturedector.onTouchEvent(event!!)
        when (event.action) {
            0 -> {
                x1 = event.x
                y1 = event.y
            }

            1 -> {
                x2 = event.x
                y2 = event.y
                val valueX: Float = x2 - x1
                val valuey: Float = y2 - y1

                if (abs(valueX) > Min_distance) {
                    if (x2 > x1) {
                        Toast.makeText(this, "Right swipe", Toast.LENGTH_SHORT).show()
                        Log.e("abs(valueX)> Min_distance", "$x1,$x2")
                    } else {
                        Toast.makeText(this, "Left swipe", Toast.LENGTH_SHORT).show()
                        Log.e("abs(valueX)> Min_distance", "$x1,$x2")
                    }
                }
                else if (abs(valuey) > Min_distance) {
                    if (y2 > y1) {
//                        Toast.makeText(this, "Down swipe", Toast.LENGTH_SHORT).show()
//                        Log.e("abs(valuey)> Min_distance", "$y1,$y2")
                        android.os.Handler().postDelayed({ fullimage.visibility = View.GONE }, 7000)
                        fullimage.startAnimation(animation)
                        onBackPressed()
                    } else {
                        Toast.makeText(this, "UP swipe", Toast.LENGTH_SHORT).show()
                        Log.e("abs(valuey)> Min_distance", "$y1,$y2")
                    }

                }
            }
        }

        return super.onTouchEvent(event)
    }

    override fun onDown(p0: MotionEvent): Boolean {
//        TODO("Not yet implemented")
        return false
    }

    override fun onShowPress(p0: MotionEvent) {
        //   TODO("Not yet implemented")
    }
    override fun onSingleTapUp(p0: MotionEvent): Boolean {
        //  TODO("Not yet implemented")
        return false
    }
    override fun onScroll(p0: MotionEvent?, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        //  TODO("Not yet implemented")
        return false
    }

    override fun onLongPress(p0: MotionEvent) {
        //  TODO("Not yet implemented")
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        //  TODO("Not yet implemented")
        return false
    }
}
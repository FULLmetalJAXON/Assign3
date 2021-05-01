package com.bignerdranch.android.draganddraw

import android.graphics.PointF
//Jackson Justus
//Original code from Big Nerd Ranch
//4-30-2021
//edited for assignment 3
class Box(val start: PointF) {

    var end: PointF = start

    val left: Float
        get() = Math.min(start.x, end.x)

    val right: Float
        get() = Math.max(start.x, end.x)

    val top: Float
        get() = Math.min(start.y, end.y)

    val bottom: Float
        get() = Math.max(start.y, end.y)
}
package com.ysn.scannerku

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import me.dm7.barcodescanner.core.ViewFinderView

open class CustomViewFinderView constructor(context: Context) : ViewFinderView(context) {

    private val paint = Paint()

    override fun drawLaser(canvas: Canvas?) {
        super.drawLaser(canvas)
    }

}

package com.example.test;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2019/10/1.
 */

public class flower extends View {
    public float bitX;
    public float bitY;
    public flower(Context context) {
        super(context);
        bitX=MEASURED_SIZE_MASK-250;
        bitY=0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        Bitmap bitmap= BitmapFactory.decodeResource(this.getResources(),R.mipmap.common);






        canvas.drawBitmap(bitmap,bitX,bitY,paint);
        if(bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}

package com.example.test;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;

/**
 * Created by Administrator on 2019/10/21.
 */

public class Surfacetest extends Surface implements SurfaceHolder.Callback {
    public Surfacetest(SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}

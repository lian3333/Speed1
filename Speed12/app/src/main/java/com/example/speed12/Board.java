package com.example.speed12;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;

public class Board extends View {
    private Player player1,player2;
    Card open1,open2;
    private Bitmap backgroundBitmap;

    private Bitmap boardBitmap;
    public Board(Context context) {
        super(context);
        player1=new Player("israel", context);
        player2=new Player("guy", context);
        for (int i=1; i<=13; i++)
        {
            //player1.
        }

        backgroundBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.bg);


    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        backgroundBitmap = Bitmap.createScaledBitmap(backgroundBitmap, w,h,true);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth()*7;
        int height = getHeight();
//        Rect dest = new Rect(-100,0,width,height);
//        canvas.drawBitmap(boardBitmap,null,dest,null);

        canvas.drawBitmap(backgroundBitmap ,0,0,null);

    }
}

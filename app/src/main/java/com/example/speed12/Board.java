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

    private Bitmap boardBitmap;
    public Board(Context context) {
        super(context);
        player1=new Player("lian_g", context);
        player2=new Player("lian_s", context);
       //open1=player1.AddCard(player1.getDeck().remove(0));
       //open2=player2.AddCard(player2.getDeck().remove(0));
        boardBitmap=BitmapFactory.decodeResource(getResources(),R.drawable.bg);


    }
    @Override
    protected void onSizeChanged(int w, int h,int oldw, int oldh){
        super.onSizeChanged(w,h,oldw,oldh);
        boardBitmap=Bitmap.createScaledBitmap(boardBitmap,w,h,true);
        if (!isInitialized){
            dealCards(w,h);
            isInitialized=true;

        }
    }
    private void dealCards (int screenw,int screenh){
        player1.getDeck().clear();
        player2.getDeck().clear();
        for(int n=1; n<=13; n++){
            for(int c=1; c<=2; c++)
            {
                player1.getDeck().add(new Card(c,n));
            }
        }



    }
   /* @Override
  // public void draw(Canvas canvas)
    {
    player1.getHand().
    }*/
    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth()*7;
        int height = getHeight();
        Rect dest = new Rect(-100,0,width,height);
        canvas.drawBitmap(boardBitmap,0,0,null);

    }

}

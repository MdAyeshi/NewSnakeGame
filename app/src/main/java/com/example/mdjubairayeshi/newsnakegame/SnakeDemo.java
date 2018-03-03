package com.example.mdjubairayeshi.newsnakegame;

import android.content.Context;
import android.view.SurfaceView;

/**
 * Created by Md Jubair Ayeshi on 12-10-2017.
 */

public class SnakeDemo extends SurfaceView implements Runnable {
    Thread t = null;
    boolean flag = false;
    int sWidth, sHeight;
    // The current m_score
    // The location in the grid in all the segments
    Context ct;
    private int[] m_SnakXs;
    private int[] m_SnakeYs;
    private int m_SnakeLength;
    private int m_MouseX;
    private int m_MouseY;
    private int m_BlockSize;
    private final int m_BLOCK_WIDE =40;
    private int m_NumBlock_Height;
    enum direction {UP,RIGHT,DOWN,LEFT};
    direction m_direction = direction.RIGHT;
    private long m_Next_FrameTime;

    SnakeDemo(Context c, int height, int width)
    {
        super(c);

    }
   public void run()
    {

    }

    public SnakeDemo(Context context) {
        super(context);
    }

}

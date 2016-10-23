package ggikko.me.optviewlayoutapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by ggikko on 2016. 10. 22..
 */

public class CustomLinear extends RelativeLayout {
    public CustomLinear(Context context) {
        super(context);
        setUp(context, null);
    }

    public CustomLinear(Context context, AttributeSet attrs) {
        super(context, attrs);
        setUp(context,attrs);
    }

    private void setUp(Context context, AttributeSet attrs) {
        inflate(context, R.layout.customview, this);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) setPressed(true);
        return super.onTouchEvent(event);
    }
}

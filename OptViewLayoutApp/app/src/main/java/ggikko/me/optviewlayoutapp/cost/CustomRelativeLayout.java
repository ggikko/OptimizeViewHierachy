package ggikko.me.optviewlayoutapp.cost;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;

/**
 * Created by ggikko on 2016. 10. 23..
 */

public class CustomRelativeLayout extends RelativeLayout {

    private String TAG = "ggikko";
    private String LAYOUTNAME = "CustomRelativeLayout";

    public CustomRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRelativeLayout(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.e(TAG, LAYOUTNAME + "on measure");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}

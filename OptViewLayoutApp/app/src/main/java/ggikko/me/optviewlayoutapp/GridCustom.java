package ggikko.me.optviewlayoutapp;

import android.content.Context;
import android.support.v7.widget.GridLayout;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by ggikko on 2016. 10. 22..
 */

public class GridCustom extends GridLayout {

    private String TAG = "ggikko";

    int mPrivateFlags;
    int PFLAG_PRESSED;

    public GridCustom(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public GridCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GridCustom(Context context) {
        super(context);
        mPrivateFlags |= PFLAG_PRESSED;
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        Log.e(TAG, "onmeasure");
        super.onMeasure(widthSpec, heightSpec);
    }

}

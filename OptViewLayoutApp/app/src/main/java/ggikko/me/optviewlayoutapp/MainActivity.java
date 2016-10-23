package ggikko.me.optviewlayoutapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ViewServer.get(this).addWindow(this);
    }

    public void onDestroy() {
        super.onDestroy();
//        ViewServer.get(this).removeWindow(this);
    }

    public void onResume() {
        super.onResume();
//        ViewServer.get(this).setFocusedWindow(this);
    }
}

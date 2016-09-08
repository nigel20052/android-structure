package com.basicstrutcture.Ui;

import android.app.Activity;
import android.widget.TextView;

import com.basicstrutcture.R;
import com.basicstrutcture.utility.Tags;

public class MainUi {

    protected Activity act;
    protected TextView text_demo;

    public MainUi(Activity activity){
        this.act = activity;

        text_demo = (TextView) act.findViewById(R.id.textview_demo);
        text_demo.setText(Tags.texview_demo);

    }
}

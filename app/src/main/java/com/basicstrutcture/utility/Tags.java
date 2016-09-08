package com.basicstrutcture.utility;

import android.content.res.Resources;
import android.support.v4.content.ContextCompat;

import com.basicstrutcture.R;

public class Tags {

    public static Resources res = App.getContext().getResources();

    //Activity Titles -> from string.xml
    public static String app_name = res.getString(R.string.app_name);

    //Colors -> from colors.xml
    public static int color_primary = ContextCompat.getColor(App.getContext(), R.color.colorPrimary);
    public static int colorPrimaryDark = ContextCompat.getColor(App.getContext(), R.color.colorPrimaryDark);
    public static int colorAccent = ContextCompat.getColor(App.getContext(), R.color.colorAccent);

    //General String -> from string.xml
    public static String session_local_storage = res.getString(R.string.session_local_storage);

    //TextViews
    public static String texview_demo = res.getString(R.string.texview_demo);

    //Others
    public static String demo_menu_option = res.getString(R.string.demo_menu_option);
}

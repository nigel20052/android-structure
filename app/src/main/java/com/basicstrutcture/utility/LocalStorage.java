package com.basicstrutcture.utility;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalStorage {

    protected static SharedPreferences.Editor editor;

    private static SharedPreferences getPreferens(){
        return App.getContext().getSharedPreferences(Tags.session_local_storage,Context.MODE_PRIVATE);
    }

    public static void setLocalBoolean(String var, Boolean val){
        editor = getPreferens().edit();
        editor.putBoolean(var,val);
        editor.apply();
    }

    public static Boolean getLocalBoolean(String var){
        return getPreferens().getBoolean(var, false);
    }

    public static void setLocalString(String var, String val){
        editor = getPreferens().edit();
        editor.putString(var,val);
        editor.apply();
    }

    public static String getLocalString(String var){
        return getPreferens().getString(var, "");
    }

    public static void clearLocalStorage(){
        SharedPreferences.Editor editor = getPreferens().edit();
        editor.clear();
        editor.apply();
    }
}

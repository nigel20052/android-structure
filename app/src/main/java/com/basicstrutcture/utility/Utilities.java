package com.basicstrutcture.utility;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Utilities {

    protected Activity activity;
    protected Context context;
    protected Intent i;

    public Utilities(Activity activity){
        this.activity = activity;
        this.context = App.getContext();
    }

    public void redirect(Class redirect_activity){
        i = new Intent(context,redirect_activity);
        context.startActivity(i);
    }

    public void redirectFinish(Class redirect_activity){
        activity.finish();
        i = new Intent(context,redirect_activity);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(i);
    }

    public void showToast(String mensaje){
        Toast toast = Toast.makeText(context, mensaje, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void clearData(){
        LocalStorage.clearLocalStorage();
        //Drop all tables from db function
        //deleteAlltables();
    }
}

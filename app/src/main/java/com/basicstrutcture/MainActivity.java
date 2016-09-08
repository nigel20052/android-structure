package com.basicstrutcture;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.basicstrutcture.Ui.MainUi;
import com.basicstrutcture.utility.Tags;
import com.basicstrutcture.utility.Utilities;

public class MainActivity extends AppCompatActivity {

    protected Utilities u;
    protected MainUi ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        u = new Utilities(this);
        ui = new MainUi(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menu_main_option)
            u.showToast(Tags.demo_menu_option);
        return super.onOptionsItemSelected(item);
    }
}

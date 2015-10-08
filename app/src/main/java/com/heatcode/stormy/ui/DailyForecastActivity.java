package com.heatcode.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

import com.heatcode.stormy.R;

public class DailyForecastActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        String[] daysOfTheWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,daysOfTheWeek);

        setListAdapter(adapter);



    }

}

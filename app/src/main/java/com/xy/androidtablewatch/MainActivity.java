package com.xy.androidtablewatch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xy.androidtablewatch.views.ErPercentPolyLineChart;

public class MainActivity extends AppCompatActivity {

    ErPercentPolyLineChart mChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mChart = (ErPercentPolyLineChart) findViewById(R.id.heartRit);
        String[] xVales = new String[]{"11-01", "11-02", "11-03", "11-04", "11-05", "11-06", "11-07", "11-05", "11-06", "11-07"};
        int[] yValues = new int[]{3001, 2980, 3100, 3200, 2800, 2500, 2900, 3100, 2000, 3000};
        mChart.setXYCoordinates(xVales, yValues);
    }
}

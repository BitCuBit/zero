package com.bitcubit.zero.activities;

import android.app.Activity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bitcubit.zero.R;


public class HomeActivity extends Activity implements View.OnLongClickListener, View.OnClickListener{


    private TextView tvDateHome;
    private TextView tvHourHome;
    private TextView tvNumberHome;
    private Button btResetHome;
    private Button btNewHome;
    private Button btKnownHome;
    private Button btBackHome;
    private Button btExitHome;

    private void findViews() {
        tvDateHome = (TextView)findViewById( R.id.tv_date_home );
        tvHourHome = (TextView)findViewById( R.id.tv_hour_home );
        tvNumberHome = (TextView)findViewById( R.id.tv_number_home );
        btResetHome = (Button)findViewById( R.id.bt_reset_home );
        btNewHome = (Button)findViewById( R.id.bt_new_home );
        btKnownHome = (Button)findViewById( R.id.bt_known_home );
        btBackHome = (Button)findViewById( R.id.bt_back_home );
        btExitHome = (Button)findViewById( R.id.bt_exit_home );

        btResetHome.setOnLongClickListener(this);
        btNewHome.setOnClickListener(this);
        btKnownHome.setOnClickListener(this);
        btBackHome.setOnClickListener(this);
        btExitHome.setOnClickListener(this);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViews();

        setUpDateAndTime();


    }


    private void setUpDateAndTime() {
        Time today = new Time(Time.getCurrentTimezone());
        today.setToNow();

        tvDateHome.setText(today.monthDay + "-" + (today.month + 1) + "-" + today.year);
        tvHourHome.setText(today.format("%k:%M:%S"));
    }



    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(HomeActivity.this, "Long press", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_new_home) {
            Toast.makeText(HomeActivity.this, "bt_new_home", Toast.LENGTH_SHORT).show();

        }
        else if (v.getId() == R.id.bt_known_home) {
            Toast.makeText(HomeActivity.this, "bt_known_home", Toast.LENGTH_SHORT).show();

        }
        else if (v.getId() == R.id.bt_back_home) {
            Toast.makeText(HomeActivity.this, "bt_back_home", Toast.LENGTH_SHORT).show();

        }
        else if (v.getId() == R.id.bt_exit_home) {
            Toast.makeText(HomeActivity.this, "bt_exit_home", Toast.LENGTH_SHORT).show();

        }
    }
}

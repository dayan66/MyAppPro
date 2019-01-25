package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    private TextView tvEmail;
    private LinearLayout myInfo,assignemnt,attendnece,report,classPerformance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        myInfo=(LinearLayout)findViewById(R.id.info);
        assignemnt=(LinearLayout)findViewById(R.id.assignment);
        attendnece=(LinearLayout)findViewById(R.id.attendnece);
        report=(LinearLayout)findViewById(R.id.report);
        classPerformance=(LinearLayout)findViewById(R.id.classPerformance);


        myInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIn = new Intent(Dashboard.this, myInfo.class);
                startActivity(myIn);
            }
        });
        assignemnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent assignment = new Intent(Dashboard.this, Assignment.class);
                startActivity(assignment);
            }
        });
        attendnece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attendnece = new Intent(Dashboard.this, Attendnece.class);
                startActivity(attendnece);
            }
        });
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent report = new Intent(Dashboard.this, Report.class);
                startActivity(report);
            }
        });
        classPerformance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classperformance = new Intent(Dashboard.this, ClassPerformance.class);
                startActivity(classperformance);
            }
        });

/*        tvEmail = (TextView) findViewById(R.id.tvEmailProfile);
        tvEmail.setText(getIntent().getExtras().getString("Email"));*/

    }

    public void close(View view) {

        final AlertDialog.Builder alertDialougeBuilder = new AlertDialog.Builder(this);
        alertDialougeBuilder.setMessage("Are you Sure You Want to Exit");
        alertDialougeBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);

            }
        });

        alertDialougeBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finish();
                Intent intent = new Intent(Dashboard.this, Dashboard.class);
                startActivity(intent);
            }
        });
        alertDialougeBuilder.show();
    }
}

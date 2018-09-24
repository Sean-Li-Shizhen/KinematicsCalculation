package com.yahoo.stringsean.kinematicscalculation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ViVfTbtn = (Button)findViewById(R.id.ViVfTbtn);
        ViVfTbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ViVfTIntent = new Intent(getApplicationContext(),ViVfTActivity.class);
                startActivity(ViVfTIntent);
            }
        });

        Button ViVfAbtn = (Button)findViewById(R.id.ViVfAbtn);
        ViVfAbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ViVfAIntent = new Intent(getApplicationContext(),ViVfAActivity.class);
                startActivity(ViVfAIntent);
            }
        });

        Button ViVfdXbtn = (Button)findViewById(R.id.ViVfdXbtn);
        ViVfdXbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ViVfdXIntent = new Intent(getApplicationContext(),ViVfdXActivity.class);
                startActivity(ViVfdXIntent);
            }
        });

        Button ViTAbtn = (Button)findViewById(R.id.ViTAbtn);
        ViTAbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ViTAIntent = new Intent(getApplicationContext(),ViTAActivity.class);
                startActivity(ViTAIntent);
            }
        });

        Button ViTdXbtn = (Button)findViewById(R.id.ViTdXbtn);
        ViTdXbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ViTdXIntent = new Intent(getApplicationContext(),ViTdXActivity.class);
                startActivity(ViTdXIntent);
            }
        });

        Button ViAdXbtn = (Button)findViewById(R.id.ViAdXbtn);
        ViAdXbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ViAdXIntent = new Intent(getApplicationContext(),ViAdXActivity.class);
                startActivity(ViAdXIntent);
            }
        });

        Button VfTAbtn = (Button)findViewById(R.id.VfTAbtn);
        VfTAbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent VfTAIntent = new Intent(getApplicationContext(),VfTAActivity.class);
                startActivity(VfTAIntent);
            }
        });

        Button VfTdXbtn = (Button)findViewById(R.id.VfTdXbtn);
        VfTdXbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent VfTdXIntent = new Intent(getApplicationContext(),VfTdXActivity.class);
                startActivity(VfTdXIntent);
            }
        });

        Button VfAdXbtn = (Button)findViewById(R.id.VfAdXbtn);
        VfAdXbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent VfAdXIntent = new Intent(getApplicationContext(),VfAdXActivity.class);
                startActivity(VfAdXIntent);
            }
        });

        Button TAdXbtn = (Button)findViewById(R.id.TAdXbtn);
        TAdXbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TAdXIntent = new Intent(getApplicationContext(),TAdXActivity.class);
                startActivity(TAdXIntent);
            }
        });

        Button LearnButton = (Button)findViewById(R.id.LearnButton);
        LearnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Learn = "https://learn.uwaterloo.ca";
                Uri WebAddress = Uri.parse(Learn);

                Intent LearnIntent = new Intent(Intent.ACTION_VIEW,WebAddress);
                if (LearnIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(LearnIntent);
                }
            }
        });
    }
}

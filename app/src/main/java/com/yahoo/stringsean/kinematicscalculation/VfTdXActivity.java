package com.yahoo.stringsean.kinematicscalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VfTdXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vf_td_x);

        Button CalculateBtn = (Button)findViewById(R.id.CalculateBtn);
        CalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText VfEditText = (EditText)findViewById(R.id.VfEditText);
                EditText TEditText = (EditText)findViewById(R.id.TEditText);
                EditText dXEditText = (EditText)findViewById(R.id.AEditText);
                TextView ViTextView = (TextView)findViewById(R.id.ViTextView);
                TextView ATextView = (TextView)findViewById(R.id.ATextView);

                double Vf = Double.parseDouble(VfEditText.getText().toString());
                double T = Double.parseDouble(TEditText.getText().toString());
                double dX = Double.parseDouble(dXEditText.getText().toString());
                double A = 2*(Vf*T-dX)/(T*T);
                double Vi = Vf-A*T;
                ViTextView.setText("Vi: " + Vi);
                ATextView.setText("A: " + A);
            }
        });
    }
}

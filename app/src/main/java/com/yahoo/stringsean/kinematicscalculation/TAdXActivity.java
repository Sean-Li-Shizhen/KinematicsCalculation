package com.yahoo.stringsean.kinematicscalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TAdXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tad_x);

        Button CalculateBtn = (Button)findViewById(R.id.CalculateBtn);
        CalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText TEditText = (EditText)findViewById(R.id.TEditText);
                EditText AEditText = (EditText)findViewById(R.id.AEditText);
                EditText dXEditText = (EditText)findViewById(R.id.dXEditText);
                TextView ViTextView = (TextView)findViewById(R.id.ViTextView);
                TextView VfTextView = (TextView)findViewById(R.id.VfTextView);

                double T = Double.parseDouble(TEditText.getText().toString());
                double A = Double.parseDouble(AEditText.getText().toString());
                double dX = Double.parseDouble(dXEditText.getText().toString());
                double Vi = (dX-0.5*A*T*T)/T;
                double Vf = Vi+A*T;
                ViTextView.setText("Vi: " + Vi);
                VfTextView.setText("Vf: " + Vf);
            }
        });
    }
}

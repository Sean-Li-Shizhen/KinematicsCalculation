package com.yahoo.stringsean.kinematicscalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VfAdXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vf_ad_x);

        Button CalculateBtn = (Button)findViewById(R.id.CalculateBtn);
        CalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText VfEditText = (EditText)findViewById(R.id.VfEditText);
                EditText AEditText = (EditText)findViewById(R.id.AEditText);
                EditText dXEditText = (EditText)findViewById(R.id.dXEditText);
                TextView ViTextView = (TextView)findViewById(R.id.ViTextView);
                TextView TTextView = (TextView)findViewById(R.id.TTextView);

                double Vf = Double.parseDouble(VfEditText.getText().toString());
                double A = Double.parseDouble(AEditText.getText().toString());
                double dX = Double.parseDouble(dXEditText.getText().toString());
                double Vi1 = Math.sqrt(Vf*Vf-2*A*dX);
                double Vi2 = -Math.sqrt(Vf*Vf-2*A*dX);
                double T1 = (Vf-Vi1)/A;
                double T2 = (Vf-Vi2)/A;
                if (T1>0) {
                    ViTextView.setText("Vi: " + Vi1);
                    TTextView.setText("T: " + T1);
                }
                else {
                    ViTextView.setText("Vi: " + Vi2);
                    TTextView.setText("T: " + T2);
                }
            }
        });
    }
}

package org.esiea.ay_bahri_laurent_fabrice.autoformation;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;
public class MainActivity extends AppCompatActivity {
private static DatePickerDialog dpd; // Var de classe dpd
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_date= (TextView)findViewById(R.id.tv_date);
        String now = DateUtils.formatDateTime(getApplicationContext(),(new Date()).getTime(), java.text.DateFormat.FULL);
        tv_date.setText(now);

        Button bouton1=(Button)findViewById(R.id.btn_hello_world);
        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),getString(R.string.titre),Toast.LENGTH_LONG).show();// Reprend le text dans balise named titre pour le reafficher comme notif
            }
        });


        }
    }


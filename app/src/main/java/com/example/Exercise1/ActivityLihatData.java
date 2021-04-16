package com.example.Exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    Bundle bundle = getIntent().getExtras();
    String nama = bundle.getString("a");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        switch (nama){
            case "Zulva":
                tvnama.setText("Zulva");
                tvnomor.setText("20190140133");
                break;
            case "Fadillah":
                tvnama.setText("Fadillah ");
                tvnomor.setText("081224466651");
                break;
            case "Maruf":
                tvnama.setText("Maruf");
                tvnomor.setText("20010407223");
                break;
            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("08122453344");
                break;
            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("08126633344");
                break;
            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("08122555344");
                break;
            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("08125556344");
                break;
            case "Gita":
                tvnama.setText("Gita S");
                tvnomor.setText("0819923344");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomor.setText("08122233234");
                break;
            case "Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("08122969344");
                break;

        }
    }
}
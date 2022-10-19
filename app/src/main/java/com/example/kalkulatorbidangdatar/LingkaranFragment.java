package com.example.kalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranFragment extends Fragment {

    private EditText txt_diameter;
    private Button btnHasil;
    private TextView hasilLuas, hasilkeliling;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lingkaran, container, false);

        txt_diameter = v.findViewById(R.id.txt_diameter);
        btnHasil = v.findViewById(R.id.btnHasil);
        hasilLuas = v.findViewById(R.id.hasilLuas);
        hasilkeliling = v.findViewById(R.id.hasilKeliling);


        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_diameter.getText().toString();
                if(nilai.isEmpty()){
                    txt_diameter.setError("Data tidak boleh kosong");
                    txt_diameter.requestFocus();
                }else {
                    Double diameter = Double.parseDouble(nilai);
                    Double luas =  0.25 * 3.14 * (diameter * diameter);
                    Double keliling = 3.14 * diameter;

                    hasilLuas.setText(String.format("%.2f", luas));
                    hasilkeliling.setText(String.format("%.2f", keliling));
                }
            }
        });


    return v;
    }
}
package com.pacifico.villegas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import com.pacifico.villegas.DAO.RecyclerViewAdaptador;
import com.pacifico.villegas.bean.Cliente;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RadioButton rBtnCodAf;
    RadioButton rBtnDniAf;
    RadioButton rBtnNomAf;
    EditText etParametro;
    Button btnBuscar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     rBtnCodAf = findViewById(R.id.rBtnCodAf);
     rBtnDniAf = findViewById(R.id.rBtnDniAf);
     rBtnNomAf = findViewById(R.id.rBtnNomAf);
     etParametro = findViewById(R.id.etParametro);
     btnBuscar = findViewById(R.id.btnBuscar);

    }


}

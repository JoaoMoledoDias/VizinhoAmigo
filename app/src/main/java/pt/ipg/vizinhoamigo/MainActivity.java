package pt.ipg.vizinhoamigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) findViewById(R.id.button_lis_vizinhos);
        one.setOnClickListener(this);
        Button two = (Button) findViewById(R.id.button_lis_farmacias);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.button_list_supermercados);
        three.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_lis_vizinhos:
                Intent intent1 = new Intent(this, listaVizinhos.class);
                startActivity(intent1);
                break;
           case R.id.button_lis_farmacias:
                Intent intent2 = new Intent(this, ListaFarmacias.class);
                startActivity(intent2);
                break;
            case R.id.button_list_supermercados:
                Intent intent3 = new Intent(this, ListaSupermercados.class);
                startActivity(intent3);
                break;
        }

    }
}





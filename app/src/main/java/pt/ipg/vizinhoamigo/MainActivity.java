package pt.ipg.vizinhoamigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_lis_vizinhos);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openlistaVizinhos();
            }
        });
    }
    public void openlistaVizinhos(){

        Intent intent = new Intent(this, listaVizinhos.class);
        startActivity(intent);
    }
}





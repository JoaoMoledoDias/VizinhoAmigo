package pt.ipg.vizinhoamigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListaVizinhos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_vizinhos);
    }

    public void registo_vizinho(View view) {
        Intent intent = new Intent(this, RegistoVizinho.class);
        startActivity(intent);
    }
}

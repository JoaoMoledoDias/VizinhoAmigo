package pt.ipg.vizinhoamigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistoFarmacia extends AppCompatActivity {

    FirebaseDatabase rootNodefar;
    DatabaseReference referencefar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registo_farmacia);
    }

    public void registarfarmacia (View v){
        EditText editTextNomeFarmacia = (EditText) findViewById(R.id.editTextNomeFarmacia);
        final String nomefarmacia = editTextNomeFarmacia.getText().toString();

        if (nomefarmacia.length() == 0) {
            editTextNomeFarmacia.setError(getString(R.string.nome_obrigatorio));
            editTextNomeFarmacia.requestFocus();
        }

        final EditText editTextTelemovelFarmacia = (EditText) findViewById(R.id.editTextTelemovelFarmacia);
        final String telemovelfarmacia = editTextTelemovelFarmacia.getText().toString();

        if (telemovelfarmacia.length() < 9) {
            editTextTelemovelFarmacia.setError(getString(R.string.telemovel_invalido));
            editTextTelemovelFarmacia.requestFocus();
        }

        EditText editTextMoradaFarmacia = (EditText) findViewById(R.id.editTextCityFarmacia);
        final String moradafarmacia = editTextMoradaFarmacia.getText().toString();

        if (moradafarmacia.length() == 0) {
            editTextMoradaFarmacia.setError(getString(R.string.morada_invalida));
            editTextMoradaFarmacia.requestFocus();
        }
        Button button = (Button) findViewById(R.id.button_registofarmacia);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                rootNodefar = FirebaseDatabase.getInstance();
                referencefar = rootNodefar.getReference("Farmácia");

                FarmaciaHelpClass helperClass = new FarmaciaHelpClass(nomefarmacia, telemovelfarmacia, moradafarmacia);

                referencefar.child(nomefarmacia).setValue(helperClass);

                openlistfarmacias();
            }
        });
    }

    public void openlistfarmacias() {
        Intent intent = new Intent(this, ListaFarmacias.class);
        startActivity(intent);
    }
}
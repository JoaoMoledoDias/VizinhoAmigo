package pt.ipg.vizinhoamigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistoSupermercado extends AppCompatActivity {

    FirebaseDatabase rootNodesuper;
    DatabaseReference referencesuper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registo_supermercado);
    }
        public void registarsupermercado (View v){
            EditText editTextNomeSupermercado = (EditText) findViewById(R.id.editTextNomeSupermercado);
            final String nomesupermercado = editTextNomeSupermercado.getText().toString();

            if (nomesupermercado.length() == 0) {
                editTextNomeSupermercado.setError(getString(R.string.nome_obrigatorio));
                editTextNomeSupermercado.requestFocus();
            }

            final EditText editTextTelemovelSupermercado = (EditText) findViewById(R.id.editTextTelemovelSupermercado);
            final String telemovelsupermercado = editTextTelemovelSupermercado.getText().toString();

            if (telemovelsupermercado.length() < 9) {
                editTextTelemovelSupermercado.setError(getString(R.string.telemovel_invalido));
                editTextTelemovelSupermercado.requestFocus();
            }

            EditText editTextMoradaSupermercado = (EditText) findViewById(R.id.editTextCitySupermercado);
            final String moradasupermercado = editTextMoradaSupermercado.getText().toString();

            if (moradasupermercado.length() == 0) {
                editTextMoradaSupermercado.setError(getString(R.string.morada_invalida));
                editTextMoradaSupermercado.requestFocus();
            }
            Button button = (Button) findViewById(R.id.button_registosupermercado);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    rootNodesuper = FirebaseDatabase.getInstance();
                    referencesuper = rootNodesuper.getReference("Supermercado");

                    SupermercadoHelpClass helperClass = new SupermercadoHelpClass(nomesupermercado, telemovelsupermercado, moradasupermercado);

                    referencesuper.child(nomesupermercado).setValue(helperClass);

                    openlistsuper();
                }
            });
        }

        public void openlistsuper() {
            Intent intent = new Intent(this, ListaSupermercados.class);
            startActivity(intent);
        }
    }
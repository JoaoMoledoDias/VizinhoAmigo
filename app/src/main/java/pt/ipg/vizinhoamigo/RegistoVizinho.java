package pt.ipg.vizinhoamigo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistoVizinho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registo_vizinho);
    }

    public void registar(View view) {
        EditText  editTextNome = (EditText) findViewById(R.id.editTextNome);
        String nome = editTextNome.getText().toString();

        if(nome.length()  == 0){
            editTextNome.setError(getString(R.string.nome_obrigatorio));
            editTextNome.requestFocus();
            return;
        }

        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        String email = editTextEmail.getText().toString();

        if(email.length() == 0){
            editTextEmail.setError(getString(R.string.email_obrigatorio));
            editTextEmail.requestFocus();
            return;
        }

        EditText editTextTelemovel = (EditText) findViewById(R.id.editTextTelemovel);
        String telemovel = editTextTelemovel.getText().toString();

        if(telemovel.length() < 9 ){
            editTextTelemovel.setError(getString(R.string.telemovel_invalido));
            editTextTelemovel.requestFocus();
            return;
        }

        EditText editTextMorada = (EditText) findViewById(R.id.editTextMorada);
        String morada = editTextMorada.getText().toString();

        if(morada.length() == 0 ) {
            editTextMorada.setError(getString(R.string.morada_invalida));
            editTextMorada.requestFocus();
            return;
        }
    }
}

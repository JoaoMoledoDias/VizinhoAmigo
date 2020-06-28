package pt.ipg.vizinhoamigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistoVizinho extends AppCompatActivity {

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registo_vizinho);

    }

    public void registar(View view) {
        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        final String nome = editTextNome.getText().toString();

        if (nome.length() == 0) {
            editTextNome.setError(getString(R.string.nome_obrigatorio));
            editTextNome.requestFocus();
        }

        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        final String email = editTextEmail.getText().toString();

        if (email.length() == 0) {
            editTextEmail.setError(getString(R.string.email_obrigatorio));
            editTextEmail.requestFocus();
        }

        final EditText editTextTelemovel = (EditText) findViewById(R.id.editTextTelemovel);
        final String telemovel = editTextTelemovel.getText().toString();

        if (telemovel.length() < 9) {
            editTextTelemovel.setError(getString(R.string.telemovel_invalido));
            editTextTelemovel.requestFocus();
        }

        EditText editTextMorada = (EditText) findViewById(R.id.editTextCity);
        final String morada = editTextMorada.getText().toString();

        if (morada.length() == 0) {
            editTextMorada.setError(getString(R.string.morada_invalida));
            editTextMorada.requestFocus();
        }
        Button button = (Button) findViewById(R.id.button_registovizinho);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Vizinho");

                VizinhoHelpClass helperClass = new VizinhoHelpClass(nome, email, telemovel, morada);

                reference.child(nome).setValue(helperClass);

                Toast.makeText(getBaseContext(), R.string.Vizinho_sucesso,Toast.LENGTH_LONG).show();

                openlistvizinhos();
            }
        });
    }

    public void openlistvizinhos() {
        Intent intent = new Intent(this, listaVizinhos.class);
        startActivity(intent);
    }
}



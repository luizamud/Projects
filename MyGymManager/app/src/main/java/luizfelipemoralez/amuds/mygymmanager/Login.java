package luizfelipemoralez.amuds.mygymmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText id_senha ,id_usuario;
    private Button id_login;
    DAO dao = new DAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        id_senha = findViewById(R.id.id_senha);
        id_usuario = findViewById(R.id.id_usuario);
        id_login = findViewById(R.id.id_login);
        id_usuario.setText("amuds");
        id_senha.setText("luizandrino2");


    }

    public void sendCheckup(View view) {
        String path = "/users/"+id_usuario.getText().toString().trim();
        String user = id_usuario.getText().toString();
        String pass = id_senha.getText().toString();
        if(dao.comparaId(user,pass,path)){
            Intent intent = new Intent(this,FichaUsuario.class);
            startActivity(intent);

        }

        }

}





package luizfelipemoralez.amuds.mygymmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Button id_login;
    private Button id_singin;
    private Button id_develop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        id_singin = findViewById(R.id.id_cadastrar);
        id_login = findViewById(R.id.id_entrar);
        id_develop = findViewById(R.id.id_develop);
    }

    public void sendLogin(View view) {
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }

    public void sendSingIn(View view) {
        Intent intent = new Intent(this,Singin.class);
        startActivity(intent);
    }

    public void sendDevelop(View view) {
        Intent intent = new Intent(this,FichaUsuariodes.class);
        startActivity(intent);
    }
}

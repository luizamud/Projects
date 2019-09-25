package luizfelipemoralez.amuds.mygymmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.FirebaseError;

public class Singin extends AppCompatActivity {
    private CheckBox temp_termos;
    private EditText temp_usuario;
    private EditText temp_nome;
    private EditText temp_sobrenome;
    private EditText temp_senha;
    private RadioGroup temp_radio_manager;
    private RadioButton temp_musculacao;
    private RadioButton temp_cross;
    private RadioButton temp_maratona;
    public FichaUsuario fichaUsuario;
    UsuarioCadastro user = new  UsuarioCadastro();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);

        temp_usuario = findViewById(R.id.temp_usuario);
        temp_nome = findViewById(R.id.temp_nome);
        temp_sobrenome = findViewById(R.id.temp_sobrenome);
        temp_senha = findViewById(R.id.temp_senha);
        temp_musculacao = findViewById(R.id.temp_musculacao);
        temp_cross = findViewById(R.id.temp_cross);
        temp_maratona = findViewById(R.id.temp_maratona);
        temp_termos = findViewById(R.id.temp_termos);
        temp_radio_manager = findViewById(R.id.temp_radio);
        limpaTudo();
    }


    public void sendSingIn(View view) {

        if(verificaTexto() == true){
              if( verificaCheckbox() == true){
                 if(verificaRadioGroup() == true){
                     Intent intent = new Intent(this,FichaUsuario.class);
                     intent.putExtra("Usuario",temp_usuario.getText().toString());
                     intent.putExtra("Nome",temp_nome.getText().toString());
                     intent.putExtra("Sobrenome",temp_sobrenome.getText().toString());
                     intent.putExtra("Senha",temp_senha.getText().toString());
                     startActivity(intent);
                 }else {
                      verificaRadioGroup();
                  }
              }else{
                  verificaCheckbox();
              }
          }else {
              verificaTexto();
          }
    }

    public boolean verificaTexto(){

        boolean param = false;
       String aux_usuario = temp_usuario.getText().toString();
       String aux_nome = temp_nome.getText().toString();
       String aux_sobrenome = temp_sobrenome.getText().toString();
       String aux_senha = temp_senha.getText().toString();
       String aux_aviso = " não pode ficar em branco";

       if(!aux_usuario.equalsIgnoreCase("")&&!aux_usuario.equalsIgnoreCase("Usuario")){
            if(!aux_nome.equalsIgnoreCase("")&&!aux_nome.equalsIgnoreCase("Nome")){
                if(!aux_sobrenome.equalsIgnoreCase("")&&!aux_sobrenome.equalsIgnoreCase("Sobrenome")){
                    if(!aux_senha.equalsIgnoreCase("")&&!aux_senha.equalsIgnoreCase("Senha")){
                        param = true;
                    }else{
                        Toast.makeText(this, "Senha"+aux_aviso, Toast.LENGTH_LONG).show();
                        temp_senha.requestFocus();
                    }
                }else {
                    Toast.makeText(this, "Sobrenome"+aux_aviso, Toast.LENGTH_LONG).show();
                    temp_sobrenome.requestFocus();
                }
            }else {
                Toast.makeText(this, "Nome"+aux_aviso, Toast.LENGTH_LONG).show();
                temp_nome.requestFocus();
            }
       }else{
           Toast.makeText(this, "Usuario"+aux_aviso, Toast.LENGTH_LONG).show();
           temp_usuario.requestFocus();

       }

    return param;
    }
    public boolean verificaCheckbox(){
        boolean param = false;
        if(!temp_termos.isChecked()){
            Toast.makeText(this, "Aceite o termo para prosseguir", Toast.LENGTH_SHORT).show();
        }else{
            param = true;
        }
        return param;

    }
    public boolean verificaRadioGroup(){
        boolean param = false;
        String aux_msg = "Modalidade selecionada foi ";
        String aux_msg_err = "Selecione uma modalidade para prosseguir";
        switch (temp_radio_manager.getCheckedRadioButtonId()){
            case R.id.temp_maratona:
                Toast.makeText(this, aux_msg+"Maratona", Toast.LENGTH_LONG).show();
                param = true;
                break;
            case R.id.temp_musculacao:
                Toast.makeText(this, aux_msg+"Musculação", Toast.LENGTH_LONG).show();
                param = true;
                break;
            case R.id.temp_cross:
                Toast.makeText(this, aux_msg+"Cross Fit", Toast.LENGTH_LONG).show();
                param = true;
                break;
            default:
                Toast.makeText(this, aux_msg_err, Toast.LENGTH_LONG).show();
                param = false;
        }
        return param;
    }

    public void sendClear(View view) {
        limpaTudo();
    }

    public void limpaTudo(){
        temp_usuario.setText("Usuario");
        temp_nome.setText("Nome");
        temp_sobrenome.setText("Sobrenome");
        temp_senha.setText("Senha");
        temp_termos.setChecked(false);
        temp_radio_manager.clearCheck();
    }
    public void sendCreateUser(){
        temp_usuario.setText("Usuario");
        temp_nome.setText("Nome");
        temp_sobrenome.setText("Sobrenome");
        temp_senha.setText("Senha");
        temp_termos.setChecked(false);
        temp_radio_manager.clearCheck();
    }
}
/**
 *
 */

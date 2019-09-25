package luizfelipemoralez.amuds.mygymmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FichaUsuario extends AppCompatActivity {
    private String aviso = "Digite o(a) seu(a) ";
    private String usuario;
    private String senha;
    private String nome ;
    private String sobrenome;
    private TextView id_nome;
    private TextView id_peso;
    private TextView id_altura;
    private TextView id_peito;
    private TextView id_cintura;
    private TextView id_quadril;
    private TextView id_coxa;
    private TextView id_panturrilha;
    private TextView id_biceps;
    private TextView id_antebraco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_usuario);
        id_nome = findViewById(R.id.id_nome_completo);
        id_peso = findViewById(R.id.id_peso);
        id_altura = findViewById(R.id.id_altura);
        id_peito = findViewById(R.id.id_peito);
        id_cintura = findViewById(R.id.id_cintura);
        id_quadril = findViewById(R.id.id_quadril);
        id_coxa = findViewById(R.id.id_coxa);
        id_panturrilha = findViewById(R.id.id_panturrilha);
        id_biceps = findViewById(R.id.id_biceps);
        id_antebraco = findViewById(R.id.id_antebraco);
        Bundle extra = getIntent().getExtras();
        usuario = extra.getString("Usuario");
        nome = extra.getString("Nome");
        sobrenome = extra.getString("Sobrenome");
        senha = extra.getString("Senha");

        startFicha();
    }

    public void startFicha(){
        id_nome.setText(nome+" "+sobrenome);
        id_nome.setEnabled(false);
        id_peso.requestFocus();
        id_peso.setText(aviso+"Peso");
        id_altura.setText(aviso+"Altura");
        id_peito.setText(aviso+"Peito");
        id_cintura.setText(aviso+"Cintura");
        id_quadril.setText(aviso+"Quadril");
        id_coxa.setText(aviso+"Coxa");
        id_panturrilha.setText(aviso+"Panturrilha");
        id_biceps.setText(aviso+"Biceps");
        id_antebraco.setText(aviso+"Antebraço");

    }

    /**
     * private void clearFicha(){
     *         id_nome.setEnabled(false);
     *         id_peso.requestFocus();
     *         id_peso.setText("12.4");
     *         id_altura.setText("12.4");
     *         id_peito.setText("12");
     *         id_cintura.setText("12");
     *         id_quadril.setText("12");
     *         id_coxa.setText("12");
     *         id_panturrilha.setText("12");
     *         id_biceps.setText("12");
     *         id_antebraco.setText("21");
     *
     *     }
     */

      private void clearFicha(){
              id_nome.setEnabled(false);
              id_peso.requestFocus();
              id_peso.setText("");
              id_altura.setText("");
              id_peito.setText("");
              id_cintura.setText("");
              id_quadril.setText("");
              id_coxa.setText("");
              id_panturrilha.setText("");
              id_biceps.setText("");
              id_antebraco.setText("");

          }


    public void criaFicha(){
        UsuarioCadastro temp_user = new UsuarioCadastro();
        DAO dao = new DAO();
        String path = "/users/";
        temp_user.setUsuario(this.usuario);
        temp_user.setNome(this.nome);
        temp_user.setSobrenome(this.sobrenome);
        temp_user.setSenha(this.senha);
        temp_user.setAltura(Double.parseDouble(id_altura.getText().toString()));
        temp_user.setPeso(Double.parseDouble(id_peso.getText().toString()));
        temp_user.setPeito(Double.parseDouble(id_peito.getText().toString()));
        temp_user.setCintura(Double.parseDouble(id_cintura.getText().toString()));
        temp_user.setQuadril(Double.parseDouble(id_quadril.getText().toString()));
        temp_user.setCoxa(Double.parseDouble(id_coxa.getText().toString()));
        temp_user.setPanturrilha(Double.parseDouble(id_panturrilha.getText().toString()));
        temp_user.setBiceps(Double.parseDouble(id_biceps.getText().toString()));
        temp_user.setAntebraco(Double.parseDouble(id_antebraco.getText().toString()));
        path = path+this.usuario;
        dao.gravarBanco(temp_user,path);
        Toast.makeText(this, "Salvo no banco", Toast.LENGTH_SHORT).show();
    }



    public void sendUpdateUser(View view) {
        criaFicha();
    }

    public void sendClear(View view) {
        clearFicha();
    }

    public void sendRecover(View view) {
        startFicha();
    }
}

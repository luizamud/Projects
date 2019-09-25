package luizfelipemoralez.amuds.mygymmanager;

import android.content.Intent;


import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DAO {

    private String usuario_temp;
    private String senha_temp;
    public void gravarBanco(UsuarioCadastro usuarioCadastro, String path){

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference user = database.getReference(path);
        user.setValue(usuarioCadastro);
    }
    protected void lerBanco(String path){
        String aux;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference user = database.getReference(path);

        user.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                UsuarioCadastro temp_user = dataSnapshot.getValue(UsuarioCadastro.class);
                usuario_temp = temp_user.getUsuario();
                senha_temp = temp_user.getSenha();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }
    public boolean comparaId(String user, String pass, String path) {
        boolean value = false;
        lerBanco(path);
        if(user.equals(usuario_temp)&&pass.equals(senha_temp)){
            value = true;
        }else{
            value = false;
        }
        return value;
    }

}

package comunidade;

import java.util.ArrayList;

public class Comunidade {

    private ArrayList<Usuario> usuarios;

    public Comunidade() {
        usuarios = new ArrayList<Usuario>();
    }

    public void adicionarUsuario(Usuario novoUsuario){
        usuarios.add(novoUsuario);
    }

    public Usuario encontrarUsuario(String emailDoUsuario){

        Usuario usuarioEncontrado = null;

        for(Usuario user: usuarios){
            if(user.getEmail().equals(emailDoUsuario)){
                usuarioEncontrado = user;
                break;
            }
        }
        return usuarioEncontrado;
    }
}

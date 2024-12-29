package comunidade;

import conteudo.Audio;

public class Usuario {

    private String userName;
    private String email;
    private String senha;
    private int idade;
    private int minutosOuvidos;

    public Usuario(String userName, String email, String senha, int idade) {
        this.userName = userName;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
    }

    public void tocarAudio(Audio audio){
        minutosOuvidos = minutosOuvidos + audio.getDuracao();
        audio.setTotalDeReproducoes(audio.getTotalDeReproducoes() + 1);
    }

    public void curtir(Audio audio){

        audio.setCurtidas(audio.getCurtidas() + 1);

    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMinutosOuvidos() {
        return minutosOuvidos;
    }
}

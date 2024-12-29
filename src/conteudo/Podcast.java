package conteudo;

public class Podcast extends Audio{

    private String descricao;

    public Podcast(String titulo, int duracao, int id, String descricao) {
        super(titulo, duracao, id);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

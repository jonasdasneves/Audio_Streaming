import comunidade.Comunidade;
import comunidade.Usuario;
import conteudo.Audio;
import conteudo.Catalogo;
import conteudo.Musica;
import conteudo.Podcast;

public class Main {

    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();

        catalogo.adicionarAudio(new Podcast("FLOW Podcast - episódio 1",136,1,"Conversa com Mauricio Meireles"));
        catalogo.adicionarAudio(new Musica("Otonoke", 2,2));
        catalogo.adicionarAudio(new Musica("Sunny",4,3));

        Comunidade comunidade = new Comunidade();

        comunidade.adicionarUsuario(new Usuario("jonasdasneves","jonasdasneves@gmail.com","kkksenhaincorreta",20));

        Usuario usuarioLogado = comunidade.encontrarUsuario("jonasdasneves@gmail.com");

        Audio audioDesejado = catalogo.encontrarAudio(3);

        usuarioLogado.tocarAudio(audioDesejado);
        usuarioLogado.curtir(audioDesejado);

        System.out.printf("Você ouviu %d minutos em nosso APP, Obrigado pela preferencia!",usuarioLogado.getMinutosOuvidos());
        System.out.printf("A música %s tem %d curtidas!", audioDesejado.getTitulo(),audioDesejado.getCurtidas());



    }
}

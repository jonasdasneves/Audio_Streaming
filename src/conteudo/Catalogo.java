package conteudo;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Audio> audios;

    public Catalogo(){
        audios = new ArrayList<Audio>();
    }

    public void adicionarAudio(Audio novoAudio){
        audios.add(novoAudio);
    }

    public void removerAudio(Audio audioASerRemovido){
        audios.remove(audioASerRemovido);
    }

    public Audio encontrarAudio(int audioId){

        Audio audioEncontrado = null;

        for(Audio audio : audios){
            if(audio.getId() == audioId){
              audioEncontrado = audio;
              break;
            }
        }

        return audioEncontrado;
    }
}

package ProjetoPrincipal.Modelos;

import ProjetoPrincipal.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String dirtetor;

    public String getDirtetor() {
        return dirtetor;
    }

    public void setDirtetor(String dirtetor) {
        this.dirtetor = dirtetor;
    }

    public void exibeFichaTecnica(){
        System.out.println("Título:" + getNome()+"\nAno de lançamento:" + getAnoDeLancamento()+"\nAvaliação:" + mediaAvaliacoes()+"\nDiretor:"+dirtetor+"\nDuração em minutos: "+getDuracaoEmMinutos()+" minutos");
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacoes() / 2;
    }
}
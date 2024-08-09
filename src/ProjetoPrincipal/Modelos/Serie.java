package ProjetoPrincipal.Modelos;

public class Serie extends Titulo {
    private int temporada, episodioPorTemporada, minutosPorEp;
    private boolean ativa;

    public boolean isAtiva() {
        return ativa;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public int getTemporada() {
        return temporada;
    }

    public int getMinutosPorEp() {
        return minutosPorEp;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void fichaTecnicaSerie() {
        System.out.println("Número de temporadas: " + temporada + "\nEpisódios por temporada: " + episodioPorTemporada);
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * episodioPorTemporada * minutosPorEp;
    }
}
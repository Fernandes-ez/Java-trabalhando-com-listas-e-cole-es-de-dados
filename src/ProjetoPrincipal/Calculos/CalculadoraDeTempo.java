package ProjetoPrincipal.Calculos;

import ProjetoPrincipal.Modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){
        tempoTotal+=t.getDuracaoEmMinutos();
    }

}

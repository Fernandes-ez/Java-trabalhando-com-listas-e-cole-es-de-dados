package ProjetoPrincipal.Calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os favoritos atualmente!");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado!");
        }else {
            System.out.println("Adicione a sua lista para mais tarde!");
        }

    }
}

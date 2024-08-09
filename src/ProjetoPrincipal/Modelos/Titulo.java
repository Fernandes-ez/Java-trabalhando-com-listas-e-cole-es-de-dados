package ProjetoPrincipal.Modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento ;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica(){
        System.out.println("Título:" + nome+"\nAno de lançamento:" + anoDeLancamento+"\nAvaliação:" + mediaAvaliacoes());

    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    double mediaAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

//     Getters e Setters

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }


    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }



}


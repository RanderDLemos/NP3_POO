package br.inatel.bloco;

public class Bloco {
    private static int contagem = 0;
    private String cor;

    public Bloco(String cor) {
        this.cor = cor;
        contagem ++;
    }

    public static int getContagem() {
        return contagem;
    }

    public String getCor() {
        return cor;
    }
}

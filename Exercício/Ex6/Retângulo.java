package br.inatel.formas;

public class Retangulo extends Forma {
    private double larg;
    private double alt;

    public Retangulo(String cor, double larg, double alt) {
        super(cor);
        this.larg = larg;
        this.alt = alt;
    }

    @Override
    public double area() {
        return larg*alt;
    }
}

package br.inatel.animais;

public class Gato extends Animal{
    public Gato(String nome){
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + ": miau");;
    }
}

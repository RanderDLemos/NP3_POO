import Exercicios.Ex2.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();

        p1.setNome("Rander");
        p1.setIdade(20);

        System.out.println("Nome da pessoa: " + p1.getNome());
        System.out.println("Idade da pessoa: " + p1.getIdade());
    }
}

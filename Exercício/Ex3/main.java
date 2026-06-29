import br.inatel.produto.Produto;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Produto p1 = new Produto("banana", 10.5);

        System.out.println("Produto na loja: " + p1.getNome());
        System.out.println("Seu preco: " + p1.getPreco());

        System.out.println("---------------------------");

        p1.setNome("Maçã");
        p1.setPreco(7.00);
        System.out.println("Produto na loja: " + p1.getNome());
        System.out.println("Seu preco: " + p1.getPreco());

      // poderia colocar assim tambem se usasse o public String toString():
      //System.out.println(p1);
      
    }
}

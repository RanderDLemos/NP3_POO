import br.inatel.bloco.Bloco;

import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       Bloco c1 = new Bloco("azul");
       Bloco c2 = new Bloco("amarelo");
       Bloco c3 = new Bloco("verde");

       System.out.println(Bloco.getContagem());
   }
}

import br.inatel.animais.Animal;
import br.inatel.animais.Cachorro;
import br.inatel.animais.Gato;

public class Main {
   public static void main(String[] args){
       Animal cao = new Cachorro("dobberman");
       Animal gato = new Gato("siamês");
       Animal desconhecido = new Animal("teste");

      cao.emitirSom();
      gato.emitirSom();
      desconhecido.emitirSom();
   }
}

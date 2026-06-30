import br.inatel.formas.Circulo;
import br.inatel.formas.Forma;
import br.inatel.formas.Retangulo;

public class Main {

    public static void main(String[] args){
        Forma areaC = new Circulo("Verde", 2);
        Forma areaR = new Retangulo("Amarelo", 5, 2);

        System.out.println(areaR.area());
        System.out.println(areaC.area());
    }
}

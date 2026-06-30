import br.inatel.autenticavel.Admin;
import br.inatel.autenticavel.Autenticavel;
import br.inatel.autenticavel.Cliente;

public class Main {
    public static void main(String[] args){
        Autenticavel a = new Admin();

        System.out.println(a.autenticar("Adm", "adm123"));

        Autenticavel b = new Cliente("joao");
    }
}

import br.inatel.conta.Conta;
import br.inatel.excecoes.SaldoInsuficiente;

public class Main {
    public static void main(String[] args){
        Conta c = new Conta(300);

        c.depositar(200);
        try{
            c.sacar(1000);
        }catch (SaldoInsuficiente e){
            System.out.println("Erro: " + e.getMessage());
        }finally {
            System.out.println("Operacao encerrada");
        }
    }
}

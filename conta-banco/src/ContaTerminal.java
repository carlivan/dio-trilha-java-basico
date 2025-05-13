import java.util.Scanner;

/**
 * <h1>Banco</h1>
 * A classe simula a criação de uma conta no banco
 * 
 * @author Carlivan
 * @version 1.0
 * 
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Utilizado o scanner para interagir com o usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        // Capturando o número da agência
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        // Capturando o numero da conta
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite seu nome: ");
        // Capturando o nome do titular
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe o seu saldo: ");
        // Capturando o saldo da conta
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, "));
        System.out.println("sua agência é ".concat(agencia).concat(", conta " + numeroConta));
        System.out.println("e seu saldo R$" + saldoConta + " já está disponível para saque.");

    }
}

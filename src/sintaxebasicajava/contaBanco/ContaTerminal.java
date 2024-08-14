package sintaxebasicajava.contaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao nosso banco.");

        DadosConta dadosConta = new DadosConta();

        System.out.println( "Por favor, digite o número da conta:");
        dadosConta.setNumeroConta(scanner.nextInt());

        System.out.println( "Por favor, digite o número da agência:");
        dadosConta.setAgencia(scanner.next());

        System.out.println( "Por favor, digite seu nome:");
        scanner.nextLine();
        dadosConta.setNomeCliente(scanner.nextLine());

        System.out.println( "Por favor, digite seu saldo:");
        dadosConta.setSaldo(scanner.nextDouble());

        System.out.println(dadosConta.toString());
    }
}

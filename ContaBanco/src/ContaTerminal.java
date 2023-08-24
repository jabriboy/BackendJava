import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        // variável para armazenar o lixo do buffer
        String lixo;

        System.out.print("Por favor, digite o número da Agencia: ");
        numero = sc.nextInt();

        // limpa o buffer
        lixo = sc.nextLine();

        System.out.print("Por favor, escreva a Agencia: ");
        agencia = sc.nextLine();

        System.out.print("Por favor, escreva o seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por, favor, digite o seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá! "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua Agencia é "+agencia+", conta "+numero+"e seu saldo é "+saldo+" ja disponível para saque!");

    }
}

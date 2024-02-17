import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        double saldo;

        Scanner read = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        agencia = read.next();

        System.out.println("Por favor, digite o número da conta !");
        numero = read.nextInt();

        System.out.println("Por favor, digite seu nome !");
        nome = read.next();

        System.out.println("Por favor, digite o saldo da conta !");
        saldo = read.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome,agencia, numero, saldo);
    }
}

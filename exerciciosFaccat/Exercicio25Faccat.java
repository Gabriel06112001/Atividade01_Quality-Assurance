/* Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e 
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior 
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. */


package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio25Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta do cliente: ");
        int numeroConta = sc.nextInt();
        
        System.out.print("Digite o saldo do cliente: ");
        double saldo = sc.nextDouble();
        
        System.out.print("Digite o débito do cliente: ");
        double debito = sc.nextDouble();
        
        System.out.print("Digite o crédito do cliente: ");
        double credito = sc.nextDouble();
        
        sc.close();
        
        double saldoAtual = saldo - debito + credito;
        
        System.out.println("O saldo atual da conta " + numeroConta + " é: R$ " + saldoAtual);
        
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
		
	}

}

/* Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que 
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que 
ultrapassar este valor, calcular e escrever o seu salário total. */


package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio24Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salário fixo: ");
		double salarioFixo = sc.nextDouble();
		
		System.out.print("Digite o valor das vendas efetuadas: ");
        double valorVendas = sc.nextDouble();
        
        sc.close();
        
        double comissao;
        
        if (valorVendas <= 1500) {
            comissao = valorVendas * 0.03;
        } else {
            comissao = 1500 * 0.03 + (valorVendas - 1500) * 0.05;
        }
        
        double salarioTotal = salarioFixo + comissao;
        
        System.out.println("O salário total do vendedor é: R$ " + salarioTotal);
		

	}

}

/* Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele 
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas 
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do 
vendedor.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio11Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de carro vendidos: ");
		int carrosVendidos = sc.nextInt();
		
		System.out.println("Digite o total de vendas: ");
		double valorTotalVendas = sc.nextDouble();
		
		System.out.println("Digite o salário fixo: ");
		double salarioFixo = sc.nextDouble();
		
		System.out.println("Digite o valor por carro vendido: ");
		double valorPorcarro = sc.nextDouble();
		
		double comissao = 0.05 * valorTotalVendas;
		
		
		double salarioFinal = salarioFixo + comissao + (valorPorcarro * carrosVendidos);
		
		
		System.out.println("O salário final do vendedor é: " +salarioFinal);
		
		sc.close();
		
		
		
		

	}

}

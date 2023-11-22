//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
//Calcular e escrever o valor do novo salário.
package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio09Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salário mensal atual: R$ ");
		float salario = sc.nextFloat();
		
		System.out.println("Digite a porcentagem % de reajuste do seu salário: ");
		float porcentagem = sc.nextFloat();
		
		sc.close();
		
		float aumentoReal = salario*porcentagem/100;
		float salarioFinal = aumentoReal+salario;
		System.out.println("O valor do novo salário é " + salarioFinal );
		
	}

}

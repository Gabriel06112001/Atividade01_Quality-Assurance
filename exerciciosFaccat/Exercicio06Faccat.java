// Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a 
//área do retângulo. 
package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio06Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("Digite a base do retângulo: ");
		double base = sc.nextDouble();
		
		System.out.println("Digite a altura do retângulo: ");
		double altura = sc.nextDouble();
		
		double area = base*altura;
		
		System.out.println("A área do retângulo é: "+area);
		
		
		sc.close();
	}

}

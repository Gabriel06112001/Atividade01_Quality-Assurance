/*Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor 
correspondente em graus Celsius*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio12Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double temperaturaFahrenheit = sc.nextDouble();
		
		
		double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
		
		System.out.println("O valor em graus Celsius é: "+temperaturaCelsius);
		
		sc.close();

		
		
		
		
		
		

	}

}

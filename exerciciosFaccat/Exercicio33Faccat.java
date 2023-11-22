/*Ler dois valores e imprimir uma das três mensagens a seguir: 
‘Números iguais’, caso os números sejam iguais 
‘Primeiro é maior’, caso o primeiro seja maior que o segundo; 
‘Segundo maior’, caso o segundo seja maior que o primeiro. */



package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio33Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		
		sc.close();
		
		if (valor1 == valor2) {
			System.out.println("Números iguais!");
		} else if (valor1 > valor2){
			System.out.println("Primeiro é maior!");
		} else {
			System.out.println("Segundo é maior!");
		}
		
		

	}

}

//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. 
package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio05Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		
		int valor = sc.nextInt();
		int antecessor = valor - 1;
		
		System.out.println("O antecessor de "+valor+" é: "+antecessor);
		
		sc.close();
		
		
		

	}

}

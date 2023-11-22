//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio15Faccat {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	int valor = sc.nextInt();
	
	if (valor>=0) {
		System.out.println("O VALOR É POSITIVO!");
		
	} else {
		System.out.println("O VALOR É NEGATIVO!");

	}
	
	sc.close();
		

	}

}

//Ler um valor e escrever se é positivo, negativo ou zero.

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio27Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		sc.close();
		
		
		if (valor>0) {
			System.out.println("O valor é positivo!");
		} else if (valor<0) {
			System.out.println("O valor é negativo!");
		}else {
			System.out.println("O valor é igual a 0!");
		}
		
		

	}

}

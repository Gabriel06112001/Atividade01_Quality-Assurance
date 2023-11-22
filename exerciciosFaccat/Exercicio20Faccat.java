//Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente


package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio20Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		float valor1 = sc.nextFloat();
		
		
		System.out.println("Digite o segundo valor:  ");
		float valor2 = sc.nextFloat();
		
		
		if (valor1 != valor2) {
            
            float menorValor = Math.min(valor1, valor2);
            float maiorValor = Math.max(valor1, valor2);
            System.out.println("Valores em ordem crescente: " + menorValor + ", " + maiorValor);
        } else {
            System.out.println("Os valores são iguais. Por favor, insira valores diferentes.");
        }
		
		sc.close();
	}

}

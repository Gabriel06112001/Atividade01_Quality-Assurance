/*Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno. 
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio13Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		sc.close();
		
		double pesoNota1 = 2;
        double pesoNota2 = 3;
        double pesoNota3 = 5;
        
        double mediaPonderada = (nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3) / (pesoNota1 + pesoNota2 + pesoNota3);
        
        System.out.println("A média ponderada é: "+mediaPonderada);
		
		 
		
		
		
		

	}

}

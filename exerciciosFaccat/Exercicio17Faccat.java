//) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever 
//uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o 
//aluno é aprovado).


package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio17Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota da primeira avaliação:  ");
		float nota1 = sc.nextFloat();
		
		
		System.out.println("Digite a nota da segunda avaliação:  ");
		float nota2 = sc.nextFloat();
		
		
		float mediaAritmetica = (nota1+nota2)/2;
		
		if (mediaAritmetica>=6) {
			System.out.println("ALUNO APROVADO!");
		} else {
			System.out.println("ALUNO REPROVADO!");
		}
		sc.close();
	}
	

}

// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela 
//poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio18Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int anoAtual = 2023;
		
		System.out.println("Digite o ano do seu nascimento: ");
		int anoNascimento = sc.nextInt();
		
		int aptoParaVotar = anoAtual-anoNascimento;
		
		if (aptoParaVotar>=16) {
			System.out.println("Você está apto para votar!");
		} else {
			System.out.println("Você não está apto para votar!");

		}
		
		sc.close();
	}

}

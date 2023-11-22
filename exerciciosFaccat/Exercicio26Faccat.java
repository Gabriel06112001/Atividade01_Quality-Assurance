/*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e 
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade 
média = quantidade máxima + quantidade mínima)/2). 
Se a quantidade em estoque for maior ou igual 
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar 
compra'.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio26Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade atual e estoque: ");
		int estoqueAtual = sc.nextInt();
		
		System.out.println("Digite a capacidade máxima do estoque: ");
		int estoqueMaximo = sc.nextInt();
		
		
		System.out.println("Digite a quantidade mínima do estoque: ");
		int estoqueMinimo = sc.nextInt();
		
		sc.close();
		
		int quantidadeMedia = estoqueMaximo + estoqueMinimo /2;
		
		if (estoqueAtual>=quantidadeMedia) {
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}
		
		
		

	}

}

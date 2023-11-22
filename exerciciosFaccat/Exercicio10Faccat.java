/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do 
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor 
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, 
calcular e escrever o custo final ao consumidor.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio10Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do custo de fabricação do automóvel: ");
		
		float valorAutomovel=sc.nextFloat();
		float distribuidor=valorAutomovel*28/100;
		float imposto=valorAutomovel*45/100;
		float valorFinal = valorAutomovel+distribuidor+imposto;
		
		System.out.print("O valor final do automóvel corresponde a: R$" + valorFinal);

		
		sc.close();
		
		
		
		
		

	}

}

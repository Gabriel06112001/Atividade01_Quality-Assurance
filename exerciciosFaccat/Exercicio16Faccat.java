/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem 
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e 
escreva o custo total da compra*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio16Faccat {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de maçãs compradas: ");
        int quantidadeMacas = sc.nextInt();
        
        
        double precoMenosDeDuzia = 1.30;
        double precoPeloMenosDuzia = 1.00;
        
        
        double custoTotal;
        
        
        if (quantidadeMacas<12) {
        	custoTotal = quantidadeMacas * precoMenosDeDuzia;
		} else {
			custoTotal = quantidadeMacas * precoPeloMenosDuzia;
		}
        
        System.out.println("O custo total da compra é: R$ " + custoTotal);
        
        sc.close();
 
	}

}

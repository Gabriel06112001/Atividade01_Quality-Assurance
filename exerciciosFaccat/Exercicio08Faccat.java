//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos 
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total 
//de eleitores.
package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio08Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o número total de eleitores no município: ");
        int totalEleitores = sc.nextInt();

        
        System.out.print("Digite o número de votos recebidos: ");
        int numeroVotos = sc.nextInt();

        
        sc.close();

        
        System.out.println("Número total de eleitores no município: " + totalEleitores);
        System.out.println("Número de votos recebidos: " + numeroVotos);
		
	}

}

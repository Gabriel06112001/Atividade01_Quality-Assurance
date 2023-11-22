//Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome 
//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio32Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do primeiro time: ");
        String time1 = sc.nextLine();
        
        
        System.out.print("Digite o número de gols marcados pelo primeiro time: ");
        int golsTime1 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Digite o nome do segundo time: ");
        String time2 = sc.nextLine();
        
        System.out.print("Digite o número de gols marcados pelo segundo time: ");
        int golsTime2 = sc.nextInt();
        
        sc.close();
        
        String vencedor;
        if (golsTime1 > golsTime2) {
            vencedor = time1;
        } else if (golsTime2 > golsTime1) {
            vencedor = time2;
        } else {
            vencedor = "EMPATE";
        }
        
        System.out.println("O vencedor é: " + vencedor);
		

	}

}

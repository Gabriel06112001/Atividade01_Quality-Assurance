/* Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os 
minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é 
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. 
*/


package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio21Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora de início do jogo de xadrez: ");
		int horaInicio = sc.nextInt();
		
		
		System.out.println("Digite a hora de término do jogo de xadrez: ");
		int horaFim = sc.nextInt();
		
		sc.close();
		
		int duracaoJogo;

        if (horaInicio < horaFim) {
            duracaoJogo = horaFim - horaInicio;
        } else {
            duracaoJogo = 24 - horaInicio + horaFim;
        }
        
        System.out.println("A duração do jogo em horas é: " + duracaoJogo);
		

	}

}

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio41Facat {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);

       
        System.out.print("Digite a nota da primeira verificação (N1): ");
        double N1 = sc.nextDouble();

        System.out.print("Digite a nota da segunda verificação (N2): ");
        double N2 = sc.nextDouble();

        System.out.print("Digite a nota da terceira verificação (N3): ");
        double N3 = sc.nextDouble();

      
        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = sc.nextDouble();

        
        sc.close();

        
        double mediaAproveitamento = (N1 + N2 * 2 + N3 * 3 + mediaExercicios) / 7;

        
        String conceito;
        if (mediaAproveitamento >= 9.0) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6.0) {
            conceito = "C";
        } else {
            conceito = "D";
        }

        
        System.out.println("Média de Aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

	}

}

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio22Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de horas trabalhadas em um mês: ");
        double horasTrabalhadas = sc.nextDouble();
        
        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = sc.nextDouble();

        
        double horasSemanaisRegulares = 40;
        
        double horasExtras = Math.max(horasTrabalhadas - horasSemanaisRegulares * 4, 0);
        double salarioTotal = (horasSemanaisRegulares * 4 + horasExtras) * salarioPorHora * 1.5;
        
        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);
        
        sc.close();

	}

}

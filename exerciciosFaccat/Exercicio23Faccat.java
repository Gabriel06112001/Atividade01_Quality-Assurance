package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio23Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite o sexo (M ou F): ");
        char sexo = sc.next().charAt(0);
        
        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();
        sc.close();
        
        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Digite M ou F.");
            return;
            
        }
        System.out.println("O peso ideal de " + nome + " é: " + pesoIdeal + " kg");
		

	}

}
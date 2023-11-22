//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 
//maiores.


package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio29Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double valor1 = sc.nextDouble();
		
		double valor2;
        do {
            System.out.print("Digite o segundo valor (diferente do primeiro): ");
            valor2 = sc.nextDouble();
        } while (valor2 == valor1);
        
        double valor3;
        do {
            System.out.print("Digite o terceiro valor (diferente dos dois anteriores): ");
            valor3 = sc.nextDouble();
        } while (valor3 == valor1 || valor3 == valor2);
		sc.close();
		
		double somaDosDoisMaiores = valor1 + valor2 + valor3 - Math.min(Math.min(valor1, valor2), valor3);
		
		System.out.println("A soma dos dois maiores valores é: " + somaDosDoisMaiores);
		
		

	}

}

//Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem 
//crescente. 

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio30Faccat {

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
		
		if (valor1 < valor2 && valor1 < valor3) {
            System.out.print(valor1 + ", ");
            
            if (valor2 < valor3) {
                System.out.println(valor2 + ", " + valor3);
            } else {
                System.out.println(valor3 + ", " + valor2);
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            System.out.print(valor2 + ", ");
            if (valor1 < valor3) {
                System.out.println(valor1 + ", " + valor3);
            } else {
                System.out.println(valor3 + ", " + valor1);
            }
        } else {
            System.out.print(valor3 + ", ");
            if (valor1 < valor2) {
                System.out.println(valor1 + ", " + valor2);
            } else {
                System.out.println(valor2 + ", " + valor1);
            }
		

	}
	}
}

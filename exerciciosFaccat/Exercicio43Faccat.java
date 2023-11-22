package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio43Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o valor do lado a: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor do lado b: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor do lado c: ");
        double c = sc.nextDouble();

        
        sc.close();

        
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é possível formar um triângulo");
        }

	}

}

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio31Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o valor do lado A: ");
        double ladoA = sc.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double ladoB = sc.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double ladoC = sc.nextDouble();
        
        sc.close();
        
        boolean formaTriangulo = (ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB);
        
        if (formaTriangulo) {
            System.out.println("Os lados formam um triângulo.");
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

	}

}

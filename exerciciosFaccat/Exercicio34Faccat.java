package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio34Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: ");
		int x = sc.nextInt();
		
		System.out.println("Digite o valor de y: ");
		int y = sc.nextInt();
		
		sc.close();
		
		int z = (x*y)+5;
		
		if (z<=0) {
			System.out.println("A");
		} else if (z<=100){
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		System.out.println(z);

	}

}

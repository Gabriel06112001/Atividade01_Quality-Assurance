package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio36Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a idade do primeiro homem: ");
        int idadeHomem1 = sc.nextInt();
        
        System.out.print("Digite a idade do segundo homem (diferente do primeiro): ");
        int idadeHomem2;
        do {
            idadeHomem2 = sc.nextInt();
        } while (idadeHomem2 == idadeHomem1);
        
        
        System.out.print("Digite a idade da primeira mulher: ");
        int idadeMulher1 = sc.nextInt();
        
        System.out.print("Digite a idade da segunda mulher (diferente da primeira): ");
        int idadeMulher2;
        do {
            idadeMulher2 = sc.nextInt();
        } while (idadeMulher2 == idadeMulher1);
        
        sc.close();
        
        int somaIdades = Math.max(idadeHomem1, idadeHomem2) + Math.min(idadeMulher1, idadeMulher2);
        
        
        int produtoIdades = Math.min(idadeHomem1, idadeHomem2) * Math.max(idadeMulher1, idadeMulher2);
        
        
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + somaIdades);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produtoIdades);

	}

}

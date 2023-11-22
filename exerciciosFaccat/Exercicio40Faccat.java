package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio40Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a descrição do produto: ");
		String descricaoProduto = sc.nextLine();
		
		System.out.println("Digite a quantidade adquirida: ");
		int quantidadeAdquirida = sc.nextInt();
		
		System.out.println("Digite o preço unitário: ");
		double precoUnitario = sc.nextDouble();
		
		sc.close();
		
		double total = quantidadeAdquirida*precoUnitario;
		
		double desconto;
        if (quantidadeAdquirida <= 5) {
            desconto = total * 0.02;
        } else if (quantidadeAdquirida <= 10) {
            desconto = total * 0.03; 
        } else {
            desconto = total * 0.05;
        }
        
        double totalPagar = total - desconto;
        
        System.out.println(descricaoProduto);
        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a pagar: R$ " + totalPagar);

	}

}

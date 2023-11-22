package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio37Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de morangos (em Kg): ");
        double kgMorangos = sc.nextDouble();
        
        System.out.print("Digite a quantidade de maçãs (em Kg): ");
        double kgMacas = sc.nextDouble();
        
        sc.close();
        
        double precoMorangoAte5Kg = 2.50;
        double precoMorangoAcima5Kg = 2.20;
        double precoMacaAte5Kg = 1.80;
        double precoMacaAcima5Kg = 1.50;
        
        double valorMorangos = (kgMorangos <= 5) ? kgMorangos * precoMorangoAte5Kg : kgMorangos * precoMorangoAcima5Kg;
        double valorMacas = (kgMacas <= 5) ? kgMacas * precoMacaAte5Kg : kgMacas * precoMacaAcima5Kg;
        double valorTotal = valorMorangos + valorMacas;
        
        if ((kgMorangos + kgMacas) > 8 || valorTotal > 25.00) {
            valorTotal *= 0.9; 
        }
        
        System.out.println("O valor a ser pago pelo cliente é: R$ " + valorTotal);

	}

}

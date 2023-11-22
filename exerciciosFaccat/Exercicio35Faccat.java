package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio35Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de litros vendidos: ");
        double litrosVendidos = sc.nextDouble();
        
        System.out.print("Digite o tipo de combustível (A para álcool, G para gasolina): ");
        char tipoCombustivel = sc.next().charAt(0);
        
        sc.close();
        
        double precoAlcool = 2.90;
        double precoGasolina = 3.30;
        
        double valorPago;
        
        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litrosVendidos <= 20) {
                valorPago = litrosVendidos * (precoAlcool - (precoAlcool * 0.03));
            } else {
                valorPago = litrosVendidos * (precoAlcool - (precoAlcool * 0.05));
            }
        
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litrosVendidos <= 20) {
                valorPago = litrosVendidos * (precoGasolina - (precoGasolina * 0.04));
            } else {
                valorPago = litrosVendidos * (precoGasolina - (precoGasolina * 0.06));
            }
        } else {
            System.out.println("Tipo de combustível inválido. Use A para álcool ou G para gasolina.");
            return; 
        }
        
        System.out.println("O valor a ser pago pelo cliente é: R$ " + valorPago);

	}

}

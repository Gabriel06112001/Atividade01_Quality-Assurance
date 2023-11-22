//Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.


package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio19Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		float valor1 = sc.nextFloat();
		
		
		System.out.println("Digite o segundo valor:  ");
		float valor2 = sc.nextFloat();
		
        
        if (valor1 != valor2) {
        	float maiorValor = (valor1 > valor2) ? valor1 : valor2;
        	 System.out.println("O maior valor é: " + maiorValor);    
        } else {
            System.out.println("Os valores são iguais. Por favor, insira valores diferentes.");
            
        }
        
        
		
		sc.close();

	}

}

package exerciciosFaccat;

import java.time.Year;
import java.util.Scanner;

public class Exercicio42Faccat {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

        
        System.out.print("Digite o número do empregado (código): ");
        int codigoEmpregado = sc.nextInt();

        
        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = sc.nextInt();

        
        System.out.print("Digite o ano de ingresso na empresa do empregado: ");
        int anoIngressoEmpresa = sc.nextInt();

        
        sc.close();

        
        int anoAtual = Year.now().getValue();

        
        int idade = anoAtual - anoNascimento;

        
        int tempoTrabalho = anoAtual - anoIngressoEmpresa;

        
        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");
            System.out.println("Não requerer");
        }

	}

}

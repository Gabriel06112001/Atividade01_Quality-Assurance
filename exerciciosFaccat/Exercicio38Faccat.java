/*Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja 
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a 
mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se 
esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a 
senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.*/

package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio38Faccat {

	public static void main(String[] args) {
		
		final int codigoUsuarioCorreto = 1234;
       
        final int senhaCorreta = 9999;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o código de usuário: ");
        int codigoUsuario = sc.nextInt();
        
        if (codigoUsuario != codigoUsuarioCorreto) {
            System.out.println("Usuário inválido!");
        } else {
            
            System.out.print("Digite a senha: ");
            int senha = sc.nextInt();
            
            if (senha != senhaCorreta) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Acesso permitido!");
            }
        }
		sc.close();
		
	}
	}

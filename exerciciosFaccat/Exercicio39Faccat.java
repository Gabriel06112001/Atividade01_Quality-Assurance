package exerciciosFaccat;

public class Exercicio39Faccat {

	public static void main(String[] args) {
		
		boolean A = true;
        boolean B = true;
        boolean C = false;
        
        boolean resultadoA = (A && B) || (A ^ B);
        System.out.println("a) (A && B) || (A ^ B) = " + resultadoA);
        
        
        boolean resultadoB = (A || B) && (A && C);
        System.out.println("b) (A || B) && (A && C) = " + resultadoB);
        
        boolean resultadoC = A || (C && B ^ (A && !B));
        System.out.println("c) A || (C && B ^ (A && !B)) = " + resultadoC);

	}

}

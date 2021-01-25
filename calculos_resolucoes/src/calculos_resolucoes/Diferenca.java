package calculos_resolucoes;

import java.util.Scanner;

public class Diferenca {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int A;
		int B;
		int C;
		int D;
		int diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.println("A diferença de " + A + " e " + B + " pelo produto de " + C + " e " + D + " é de: " + diferenca);
	
		sc.close();
	}

}

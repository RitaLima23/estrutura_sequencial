package calculos_resolucoes;

import java.util.Locale;
import java.util.Scanner;

public class Raio {
     
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x;
		double A;
		double area;
		double z = 3.14159;
		
		x = sc.nextDouble();
		
		A = Math.pow(x, 2.0);
		area = z * A;
		
		System.out.printf("O valor do raio da circunferência é de: %.1f%n", x);
		System.out.printf("O valor da área da circunferência é de: %.4f%n", area);
		
		sc.close();
	}
}

package calculos_resolucoes;

import java.util.Locale;
import java.util.Scanner;

public class Codigo_Pecas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //ponto flutuante
		Scanner sc = new Scanner (System.in);
		
		int codigo1;
		int numerodepecas1;
		float valorunitario1;
		int codigo2;
		int numerodepecas2;
		float valorunitario2;
		float valortotal;
		
		codigo1 = sc.nextInt();
		numerodepecas1 = sc.nextInt();
		valorunitario1 = sc.nextFloat();
		codigo2 = sc.nextInt();
		numerodepecas2 = sc.nextInt();
		valorunitario2 = sc.nextFloat();
		
		valortotal = numerodepecas1 * valorunitario1 + numerodepecas2 * valorunitario2;
		
		System.out.printf("O valor a ser pago é de: R$ %.2f%n" , valortotal);
		
		sc.close();
	}

}

package calculos_resolucoes;

import java.util.Locale;
import java.util.Scanner;

public class numero_salario_funcionario {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int matricula;
		int horastrabalhadas;
		double valorporhora;
		double salario;
		
		matricula = sc.nextInt();
		horastrabalhadas = sc.nextInt();
		valorporhora = sc.nextDouble();
		
		salario = valorporhora * horastrabalhadas;
		
		System.out.println("Matr�cula do funcion�rio: " + matricula);
		System.out.println("Sal�rio do funcion�rio: " + salario);
		
		sc.close();
		
		
	}

}

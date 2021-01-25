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
		
		System.out.println("Matrícula do funcionário: " + matricula);
		System.out.println("Salário do funcionário: " + salario);
		
		sc.close();
		
		
	}

}

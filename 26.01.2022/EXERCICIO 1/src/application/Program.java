package application;

import java.util.Scanner;

public class Program {
	public static void main(String [] args)
	{ 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		
		double anos = leia.nextDouble();
		
		
		
		System.out.println("Informe os meses: ");
		
		double meses = leia.nextDouble();
		
		
		
		System.out.println("Informe os dias: ");
		
		double dias = leia.nextDouble();
		
		
		double total = 0;
		total += dias;
		total += (meses*30);
		total += (anos*365);
		
		System.out.printf("\nO total é: %.2f",total);
		System.out.printf("\nO total em dias é: %.10f", Math.PI);

		
		
		leia.close();
				
	}
	

}

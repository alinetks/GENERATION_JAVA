package application;

import java.util.Scanner;

public class Program {
	public static void main (String [] args)
	{ 
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, R, S, D;
		
		System.out.println("Informe um numero inteiro: ");
		A = leia.nextInt ();
		
		System.out.println("Informe um numero inteiro: ");
		B = leia.nextInt ();
		
		System.out.println("Informe um numero inteiro: ");
		C = leia.nextInt ();
		
		R = (A+B)*2;
		S = (B+C)*2;
		
		D = (R+S)/2;
		
		System.out.printf("\nO valor de R = "+R+"\nO valor de S = "+S);
		System.out.printf("\nA expressão D equivale a R + S / 2 = "+D);

		
		leia.close();
		
		
		
		
	}

}

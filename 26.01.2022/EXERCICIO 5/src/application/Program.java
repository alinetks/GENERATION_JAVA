package application;

import java.util.Scanner;

public class Program {
	public static void main (String [] args)
	{ 
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, media;
		
		System.out.println("Insira a primeira nota: ");
		n1 = leia.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		n2 = leia.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		n3 = leia.nextDouble();
		
		media = ((n1 * 2)+(n2 * 3)+(n3 * 5))/(2 + 3 + 5);
		
		System.out.printf("\nA média do aluno é de: "+media);
		
		
		
		
		
		leia.close();
		
		
	}

}

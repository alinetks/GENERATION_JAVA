package application;

import java.util.Scanner;

public class Program {
	public static void main(String [] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double d, x1, x2, y1, y2;
		
		System.out.println("Entre com x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Entre com x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Entre com y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Entre com y2: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt(Math.hypot(x2 - x1, 2.0)) + Math.sqrt(Math.hypot(y2 - y1, 2.0));
		
		System.out.printf("\nA distancia entre os dois pontos é de: "+d);
		
		
		leia.close();
		
	}
	


}

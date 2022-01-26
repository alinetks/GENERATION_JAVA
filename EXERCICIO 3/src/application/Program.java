package application;

import java.util.Scanner;

public class Program {
	public static void main(String[]args)
	{ 
		Scanner leia = new Scanner(System.in);
		
		double totalSegundos, horas, minutos, segundos;
		
		System.out.println("Entre com o total de segundos: ");
		totalSegundos = leia.nextDouble();
		
		minutos = totalSegundos / 3600;
		horas = minutos % 60;
		segundos = (totalSegundos % 3600) % 60;
		
		System.out.printf("O evento durou: %.0f hora", horas);
		System.out.printf("\nO evento durou: %.0f minutos",minutos);
		
		
		leia.close();
	}

}

package application;

import java.util.Scanner;

public class Program {
	public static void main(String[]args)
	{ 
		int idade=0, menor21=0, maior50=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		while(idade != -99)
		{ 
			System.out.println("Entre com a idade: ");
			idade = leia.nextInt();
			
			if(idade<21 && idade!= -99)
			{ 
				menor21++;
			}
			else if(idade>50)
			{ 
				maior50++;
			}
		}
		
		System.out.println("\nO total de pessoas menores de 21 é: "+menor21+"\nO total de pessoas maiores de 50 é:"+maior50);
		
	}

}

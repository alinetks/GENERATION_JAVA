package application;

import java.util.Scanner;

public class Program {
	public static void main(String[]args)
	{ 
		Scanner leia = new Scanner(System.in);
		
		int idade;

		System.out.println("Entre com a idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14)
		{ 
			System.out.println("A categoria é: Infantil.");
		}
		
		else if(idade >= 15 && idade <= 17)
		{ 
			System.out.println("A categoria é: Juvenil.");
		}
		else if(idade >= 18 && idade <= 25)
		{ 
			System.out.println("A categoria é: Adulto.");
		}
		else 
		{ 
			System.out.println("Não existe categoria.");
		}
		
		leia.close();
	}

}

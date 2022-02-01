package application;

import java.util.Scanner;

public class Program {
	public static void main(String[]args)
	{ 
		Scanner ler = new Scanner(System.in);

		int n, par=0, impar=0;
		
		for(int cont=0; cont<10; cont++)
		{ 
			System.out.println("Entre com o numero: ");
			n = ler.nextInt();
			
			if(n%2 == 0)
			{ 
				n = par;
				par++;
			}
				
		    else if(n%2 != 0)
		   { 
			    n = impar;
		    	impar++;
		   }

		}
		
		
		System.out.printf("\nA quantidade de pares é: "+par);
		System.out.printf("\nA quantidade de impares é: "+impar);
	
		
		
	}

}

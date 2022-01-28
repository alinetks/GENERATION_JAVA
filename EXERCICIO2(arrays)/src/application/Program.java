package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args)
	{ 
		Scanner leia = new Scanner(System.in);
		
	int[] numeros = new int[6];	
	int soma=0, contImp=0;

	
	
	for (int x = 0; x < 6; x++)
	{ 
		System.out.println("Entre com um numero inteiro: ");
		numeros[x] = leia.nextInt();
	}
	
	//bloco de exibição
	for (int y = 0; y < 6; y++)
	{ 
		if(numeros[y] % 2 == 0)
		{ 
			soma = soma + numeros[y];
			System.out.println("Os numeros pares são: "+numeros[y]);
		}
		else if(numeros[y] % 2 != 0)
		{ 
			contImp++;
			System.out.println("Os numeros impares são: "+numeros[y]);
		}
		
	}
	
	System.out.println("\nA soma dos Pares é: "+soma);
	System.out.println("\nA contagem dos Impares é: "+contImp);

	
	//numeros[x] = leia.nextInt();
	
		
		
	}
}

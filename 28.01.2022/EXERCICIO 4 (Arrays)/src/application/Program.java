package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float [][] m1 = new float [2][2];
		float [][] m2 = new float [2][2];
		float [][] m3 = new float [2][2];
		int opcao;
		
		for(int x = 0; x < 2; x++)
		{ 
			for(int y = 0; y < 2; y++)
			{ 
				System.out.print("m1 ["+x+"]["+y+"] = ");
				m1[x][y] = leia.nextFloat();
				System.out.print("m2 ["+x+"]["+y+"] = ");
				m2[x][y] = leia.nextFloat();
			}
		}
		
		System.out.println("\n(1) Somar as duas Matrizes.");
		System.out.println("\n(2) Subtrair a primeira matriz da segunda.");
		System.out.println("\n(3) Adicionar uma constante as duas matrizes.");
		System.out.println("\n(4) Imprimir as matrizes.");
		
		System.out.println("Digite a opção escolhida: ");
		opcao = leia.nextInt();
		
		switch(opcao)
		{ 
		case 1:
			
			for(int x = 0; x < 2; x++)
			{ 
				for(int y = 0; y < 2; y++)
				{ 
					m3[x][y] = m1[x][y] + m2[x][y];
					System.out.printf("["+m3[x][y]+"]");

				}
				System.out.printf("\n");
			}
			
			
			
		break;
		
		case 2:
			
			for(int x = 0; x < 2; x++)
			{ 
				for(int y = 0; y < 2; y++)
				{ 
					m3[x][y] = m1[x][y] - m2[x][y];
					System.out.printf("["+m3[x][y]+"]");

				}
				System.out.printf("\n");
			}
			
			
		break;
		
		case 3:
			
			System.out.printf("Informe um valor para Matriz 1: ");
			m1[0][0] = leia.nextFloat();
			System.out.printf("Informe um valor para Matriz 2: ");
			m2[1][1] = leia.nextFloat();
			
			System.out.println("\nMatriz 1:");
			for(int x = 0; x < 2; x++)
			{ 
				for(int y = 0; y < 2; y++)
				{ 
					System.out.printf("["+m1[x][y]+"]");
				}
				System.out.printf("\n");
			}
			
			System.out.println("\nMatriz 2:");
			for(int x = 0; x < 2; x++)
			{ 
				for(int y = 0; y < 2; y++)
				{ 
					System.out.printf("["+m2[x][y]+"]");
				}
				System.out.printf("\n");
			}
				
		break;
		
		case 4:
			System.out.println("\nMatriz 1:");
			for(int x = 0; x < 2; x++)
			{ 
				for(int y = 0; y < 2; y++)
				{ 
					System.out.printf("["+m1[x][y]+"]");
				}
				System.out.printf("\n");
			}
			
			System.out.println("\nMatriz 2:");
			for(int x = 0; x < 2; x++)
			{ 
				for(int y = 0; y < 2; y++)
				{ 
					System.out.printf("["+m2[x][y]+"]");
				}
				System.out.printf("\n");
			}
			
		break;
		
		default://caso contrario invalido
			System.out.println("Opção invalida.");

		break;
	
		
		
		}

	}

}

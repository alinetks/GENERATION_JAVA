package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList<String>();
		
		do
		{ 
			System.out.println("\n\n---------------MENU DO ESTOQUE---------------");
			System.out.println("\n(1) Deseja adicionar um produto ao estoque? ");
			System.out.println("\n(2) Deseja retirar um produto do estoque? ");
			System.out.println("\n(3) Deseja atualizar um produto no estoque? ");
			System.out.println("\n(4) Deseja mostrar os produtos do estoque? ");
			System.out.println("\n(0) Deseja encerrar o menu? ");
			System.out.println("\nPor favor, informe a opção desejada: ");
			op = leia.nextInt();
			
			
			switch(op)
			{ 
			
			case 1:
				leia.nextLine();
				System.out.println("\nInforme o novo produto: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nInforme o produto a ser removido: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1))
				{ 
					estoque.remove(produto1);
				}
				else
				{ 
					System.out.println("\nProduto não localizado. ");
				}
				System.out.println(estoque);
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nInforme o produto a ser atualizado: ");
				String verifica = leia.nextLine();
				System.out.println("\nInforme o novo produto: ");
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica))
				{ 
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{ 
					System.out.println("\n Produto não localizado.");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nOs produtos em estoque são: ");
				System.out.println(estoque);
				break;
				
			default:
				if(op==0)
				{ 
					System.out.println("\nSistema encerrado. ");
				}
				else
				{ 
					System.out.println("\nOpção invalida. \nPor favor, digite a opção desejada: ");
				}
				
			}
			
			
		}
			while(op!=0);

	}

}

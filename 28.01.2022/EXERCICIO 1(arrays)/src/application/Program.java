package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] A = new int[6]; - como a Jaque ensinou
		
		int[] A = {1,0,5,-2,-5,7};//a //dica do Paulo para valores prévios
		int soma;
		
		soma = A[0] + A[1] + A[5];//b
		System.out.println("O valor da soma é: "+soma+"\n");//b
		A[4] = 100;//c
		
		for(int x=0; x <= 5; x++) 
		{ 
			System.out.println("A[" + x + "] = " + A[x]);
			//System.out.println("Os valores são: " + A[x]);
		}
		
		
		
		
		
		
		

	}

}

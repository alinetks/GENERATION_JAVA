package application;

import java.util.Scanner;

public class Program2 {
	public static void main(String[]args) 
	{ 
		int n1, n2, n3;
	
    Scanner leia = new Scanner(System.in);
    

    System.out.println("Entre com o primeiro número: ");
    n1 = leia.nextInt();
    
    System.out.println("Entre com o segundo número: ");
    n2 = leia.nextInt();
    
    System.out.println("Entre com o terceiro número: ");
    n3 = leia.nextInt();

    if(n1<=n2 && n2<=n3) 
    {
        System.out.println("A ordem crescente é: "+n1+", "+n2+", "+n3);
    }
    else if(n1 <= n3 && n3 <= n2){
        System.out.println("A ordem crescente é: "+n1+", "+n3+", "+n2);
    }
    else if(n2 <= n1 && n1 <= n3)
    {
        System.out.println("A ordem crescente é: "+n2+", "+n1+", "+n3);
    }
    else if(n2 <= n3 && n3 <= n1)
    {
        System.out.println("A ordem crescente é: "+n2+", "+n3+", "+n1);
    }
    else if(n3 <= n2 && n2 <= n1)
    {
        System.out.println("A ordem crescente é: "+n3+", "+n2+", "+n1);
    }
    else if(n3 <= n1 && n1 <= n2)
    {
        System.out.println("A ordem crescente é: "+n3+", "+n1+", "+n2);
    }

}
}

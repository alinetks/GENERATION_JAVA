package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object fechamento = new Object("Clara", 1200, 500);
		
		System.out.printf("O salario do mês para a funcionaria "+fechamento.getNome()+" é de R$"+ fechamento.getPagamento());
		
		
		

	}

}

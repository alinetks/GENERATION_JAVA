package application;

public class Cachorro extends Animal{
	
	public String move;
	public String acao;
	
	public Cachorro (String nome, int idade, String som, String move, String acao)
	{ 
		super(nome, idade, som);
		
		this.move = move;
		this.acao = acao;
	}
	
	
		

	public String getMove() {
		return move;
	}


	public void setMove(String move) {
		this.move = move;
	}


	public String getAcao() {
		return acao;
	}


	public void setAcao(String açao) {
		this.acao = açao;
	}	
	
}
		
		

	




	



package application;

public class Cavalo extends Animal{
	
	public String move;
	public String açao;
			
	public Cavalo (String nome, int idade, String som, String move, String açao)
	{ 
		super(nome, idade, som);
		
		this.move = move;
		this.açao = açao;
	}	

	

public String getMove() {
	return move;
}


public void setMove(String move) {
	this.move = move;
}


public String getAçao() {
	return açao;
}


public void setAçao(String açao) {
	this.açao = açao;
}		

}

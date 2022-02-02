package application;

public class Preguiça extends Animal{
	
	public String move;
	public String açao;

		
	public Preguiça (String nome, int idade, String som, String move, String açao)
	{ 
		super(nome, idade, som);
		
		this.move = move;
		this.açao = açao;
	}

	@Override
	public void emitirSom()
	{ 
		System.out.println("Zzzzzzzz...");
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

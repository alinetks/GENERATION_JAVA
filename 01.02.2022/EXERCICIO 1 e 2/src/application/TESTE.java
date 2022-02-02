package application;

public class TESTE {

	public static void main(String[] args) 
	{
		
		Cachorro scooby = new Cachorro("Scooby", 5, "Late ", "corre", "cava");
		
		System.out.println("O cachorro se chama "+scooby.getNome()+", ele tem "+scooby.getIdade()+
				" anose e ele "+scooby.getSom()+" quando tem fome.\nEle "+scooby.getMove()+" e "+scooby.getAcao()+".\n");
		scooby.emitirSom();		
		
		Cavalo pocoto = new Cavalo("Pocotó", 7, "Relincha", "corre", "trota");
		
		System.out.println("O cavalo se chama "+pocoto.getNome()+", ele tem "+pocoto.getIdade()+
				" anose e ele "+pocoto.getSom()+" quando tem fome.\nEle "+pocoto.getMove()+" e "+pocoto.getAçao()+".\n");
		pocoto.emitirSom();
		
		Preguiça soninho = new Preguiça("Soninho", 25, "Grune", "sobe em árvore", "arranha o tronco");
		
		System.out.println("A preguiça se chama "+soninho.getNome()+", ele tem "+soninho.getIdade()+
				" anose e ele "+soninho.getSom()+" quando tem fome.\nEle "+soninho.getMove()+" e "+soninho.getAçao()+".\n");
		soninho.emitirSom();

		

	}

}

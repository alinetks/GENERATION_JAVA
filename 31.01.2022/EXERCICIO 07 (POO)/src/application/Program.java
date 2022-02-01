package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object diaria = new Object ("Allan de Souza", "Uncologia", "Retido");
		
		System.out.println("Paciente: "+diaria.getPaciente()+"\nSetor: "+diaria.getSetor()+"\nStatus de alta: "+diaria.getStatus());

	}

}

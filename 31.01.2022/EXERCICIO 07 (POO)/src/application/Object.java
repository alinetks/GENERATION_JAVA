package application;

public class Object {
	
	private String paciente;
	private String setor;
	private String status;
	
	public Object (String paciente, String setor, String status)
	{ 
		
		this.setPaciente(paciente);
		this.setSetor(setor);
		this.setStatus(status);
		
	}
	

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
		


	
	
	

}

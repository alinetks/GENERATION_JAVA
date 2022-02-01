package application;

public class Object {
	
	private String nome;
	private int salario;
	private int comissao;
	private int pagamento;
	
	public Object(String funcionario, int salario, int comissao)
	{ 
		this.setNome(funcionario);
		this.setSalario(salario);
		this.setComissao(comissao);
		this.setPagamento(pagamento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	public int getPagamento() {
		return pagamento = salario + comissao;
	}

	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}
	
	
	
	
	
	
	
	
	

}

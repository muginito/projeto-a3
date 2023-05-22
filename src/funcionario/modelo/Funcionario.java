package funcionario.modelo;

public class Funcionario {
	private String nome;
	private String ocupacao;
	private String cpf;
	private int idade;
	private double salario;
	
	public Funcionario(String nome, String ocupacao, String cpf, int idade, double salario) {
		this.nome = nome;
		this.ocupacao = ocupacao;
		this.cpf = cpf;
		this.idade = idade;
		this.salario = salario;
	}
	
	public void mostraFuncionario() {
		System.out.println("");
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getOcupacao() {
		return ocupacao;
	}


	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}

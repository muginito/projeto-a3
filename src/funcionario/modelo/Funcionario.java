package funcionario.modelo;

/**
 * Classe que representa um funcionário no sistema.
 * 
 * @author mig
 *
 */
public class Funcionario {
	
	/**
	 * Atributos da classe.
	 */
	private String nome;
	private String ocupacao;
	private String cpf;
	private int idade;
	private Double salario;
	
	
	/**
	 * Construtor que recebe argumentos para popular a instância. Atribui as características do funcionário.
	 * 
	 * @param nome
	 * @param ocupacao
	 * @param cpf
	 * @param idade
	 * @param salario
	 */
	public Funcionario(String nome, String ocupacao, String cpf, int idade, double salario) {
		this.nome = nome;
		this.ocupacao = ocupacao;
		this.cpf = cpf;
		this.idade = idade;
		this.salario = salario;
	}
	
	/**
	 * Reescrita do método toString() para exibir os atributos formatados do objeto.
	 */
	@Override
	public String toString() {
		return nome + "\t" + ocupacao + "\t\t" + cpf + "\t" + idade + "\t" + salario;
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

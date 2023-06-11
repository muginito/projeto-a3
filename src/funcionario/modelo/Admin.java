package funcionario.modelo;


public class Admin extends CadastroFuncionario {
	
	private String login;
	private String senha;
	
	public Admin() {
		this.login = "admin";
		this.senha = "1234";
	}
	
	public boolean verificaAdmin(String login, String senha) {
		if (this.login == login && this.senha == senha) {
			return true;
		}
		return false;
	}
	
	public void removeFuncionario(int id) {
		super.getFuncionarios().remove(id);
	}
	
	public void modificaFuncionario(int id, String nome, String ocupacao, String cpf, int idade, double salario) {
		Funcionario f = super.getFuncionario(id);
		f.setNome(nome);
		f.setOcupacao(ocupacao);
		f.setCpf(cpf);
		f.setIdade(idade);
		f.setSalario(salario);
	}
	
}

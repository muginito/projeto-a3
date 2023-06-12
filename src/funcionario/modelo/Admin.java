package funcionario.modelo;


public class Admin extends CadastroFuncionario {
	
	private String login;
	private String senha;
	
	public Admin() {
		this.login = "admin";
		this.senha = "senha";
	}
	
	public boolean verificaAdmin(String login, String senha) {
		if (this.login.contentEquals(login) && this.senha.contentEquals(senha)) {
			return true;
		} return false;
	}
	
	public void removeFuncionario(Funcionario f) {
		super.getFuncionarios().remove(f);
	}
	
	public void modificaFuncionario(Funcionario f, String nome, String ocupacao, String cpf, int idade, double salario) {
		f.setNome(nome);
		f.setOcupacao(ocupacao);
		f.setCpf(cpf);
		f.setIdade(idade);
		f.setSalario(salario);
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getSenha() {
		return senha;
	}
}

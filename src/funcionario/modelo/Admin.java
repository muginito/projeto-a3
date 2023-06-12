package funcionario.modelo;

/**
 * Classe que extende CadastroFuncionario 
 * 
 * @author mig
 *
 */
public class Admin extends CadastroFuncionario {
	
	private String login;
	private String senha;
	
	public Admin() {
		this.login = "admin";
		this.senha = "1234";
	}
	
	/**
	 * Autenticação do admin.
	 * 
	 * @param login
	 * @param senha
	 * @return boolean
	 */
	public boolean verificaAdmin(String login, String senha) {
		if (this.login.contentEquals(login) && this.senha.contentEquals(senha)) {
			return true;
		} return false;
	}
	
	/**
	 * Remove o funcionário especificado do registro. 
	 * 
	 * @param f
	 */
	public void removeFuncionario(Funcionario f) {
		super.getFuncionarios().remove(f);
	}
	
	/**
	 * Modifica todos os atributos de um funcionário especificado.
	 * 
	 * @param f Funcionario
	 * @param nome 
	 * @param ocupacao
	 * @param cpf
	 * @param idade
	 * @param salario
	 */
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

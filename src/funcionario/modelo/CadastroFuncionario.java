package funcionario.modelo;

import java.util.ArrayList;

/**
 * Essa classe tem o objetivo de fazer operações em uma {@code ArrayList<>} simulando um sistema de registro de funcionários.
 * 
 * @author mig
 *
 */
public abstract class CadastroFuncionario {
	
	/**
	 * Atributo para a lista de funcionário.
	 */
	private ArrayList<Funcionario> funcionarios;
	
	/**
	 * Construtor da classe que instancia a lista {@code funcionarios}.
	 */
	public CadastroFuncionario() {
		funcionarios = new ArrayList<>();
	}
	
	public void listarFuncionarios() {
		for (Funcionario f : funcionarios) {
			System.out.println(f);
		}
	}
	
	/**
	 * Registra um funcionário no sistema.
	 * 
	 * @param f funcionário a ser adicionado
	 */
	public void registraFuncionario(Funcionario f) {
		funcionarios.add(f);
	}
	
	/**
	 * Mesma função de {@code get()} em List.
	 * 
	 * @param i index do elemento a ser retornado
	 * @return registro do funcionário na posição indicada
	 */
	public Funcionario getFuncionario(int i) {
		return funcionarios.get(i);
	}
	
	/**
	 * Mesma função de {@code size()} em List.
	 * 
	 * @return quantidade de funcionários registrados
	 */
	public int qntdFuncionarios() {
		return funcionarios.size();
	}
	
	/**
	 * Retorna a referência para a lista de funcionários.
	 * 
	 * @return lista de funcionarios
	 */
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	
	/**
	 * Faz uma busca e imprime os resultados.
	 * 
	 * @param s salario para busca
	 */
	public ArrayList<Funcionario> busca(double s) {
		ArrayList<Funcionario> buscaSalario = new ArrayList<>();
		for(Funcionario f : funcionarios) {
			if (f.getSalario() == s) {
				buscaSalario.add(f);
			}
		}
		return buscaSalario;
	}
	
	public ArrayList<Funcionario> busca(String nome) {
		ArrayList<Funcionario> buscaNome = new ArrayList<>();
		for (Funcionario f : funcionarios) {
			if (f.getNome() == nome) {
				buscaNome.add(f);
			}
		}
		return buscaNome;
	}
	
}

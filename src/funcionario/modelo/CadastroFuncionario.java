package funcionario.modelo;

import java.util.ArrayList;

/**
 * Essa classe tem o objetivo de fazer operações em uma {@code ArrayList<>} simulando um sistema de registro de funcionários.
 * 
 * @author mig
 *
 */
public class CadastroFuncionario {
	
	/**
	 * Atributo para a lista de funcionário.
	 */
	private ArrayList<Funcionario> funcionarios;
	
	public CadastroFuncionario() {
		funcionarios = new ArrayList<>();
	}
	
	/**
	 * Registra um funcionário no sistema.
	 * 
	 * @param f funcionário a ser adicionado
	 */
	public void registraFuncionario(Funcionario f) {
		this.funcionarios.add(f);
	}
	
	/**
	 * Mesma função de {@code get()} em List.
	 * 
	 * @param i index do elemento a ser retornado
	 * @return registro do funcionário na posição indicada
	 */
	public Funcionario getFuncionario(int i) {
		return this.funcionarios.get(i);
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
		return this.funcionarios;
	}
	
	
	/**
	 * Faz uma busca e imprime no console os registros que possuem atributo igual ao parâmetro.
	 * 
	 * @param s salario para busca
	 */
	public void busca(double s) {
		int count = 0;
		System.out.println("Nome\tOcupacao\tCPF\tIdade\tSalario");
		for(Funcionario f : funcionarios) {
			if (f.getSalario() == s) {
				System.out.println(f.toString());
				count++;
			}
		} if (count == 0) System.out.println("Nenhum item encontrado.");
	}
	
}

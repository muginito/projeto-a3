package funcionario.main;

import java.util.List;
import java.util.Scanner;

import funcionario.modelo.Admin;
import funcionario.modelo.CadastroFuncionario;
import funcionario.modelo.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
//		Instanciação de objetos
		Scanner sc = new Scanner(System.in);
		Admin cadastro = new Admin();
		
//		Algoritimo para registrar 7 objetos
		for (int i = 0; i < 7; i++) {
			String nome = "f"+i;
			String ocupacao = "o"+i;
			
			cadastro.registraFuncionario(new Funcionario(nome, ocupacao, Integer.toString(i), i, (double) i));
		}
		
		int T = Integer.MIN_VALUE;
		
//		Loop da interface do sistema
		while (T != 0) {
			System.out.println("1 - Cadastro de funcionario\n2 - Listar funcionarios\n3 - Busca por salario\n4 - Remover funcionario\n0 - Sair");
			System.out.println("Insira a opcao: ");
			T = sc.nextInt();
			
//			Mensagem de encerramento do sistema
			if (T == 0) System.out.println("Sistema encerrado.");
			
//			Menu de cadstro de funcionario
			else if (T == 1) {
				System.out.println("\n***Cadastro de funcionario***");
				System.out.println("Digite o nome do funcionario: ");
				String nome = sc.next();
				System.out.println("Digite a ocupacao: ");
				String ocupacao = sc.next();
				System.out.println("Digite o CPF: ");
				String cpf = sc.next();
				System.out.println("Digite a idade");
				int idade = sc.nextInt();
				System.out.println("Digite o salario");
				double salario = sc.nextDouble();
				
				cadastro.registraFuncionario(new Funcionario(nome, ocupacao, cpf, idade, salario));
				
//			Lista tabular de funcionarios
			} else if (T == 2) {
				System.out.println("\n***Lista de funcionarios***\nNome\t\tOcupacao\tSalario");
				for (Funcionario f : cadastro.getFuncionarios()) {
					System.out.println(f.getNome() + "\t\t" + f.getOcupacao() + "\t\t" + f.getSalario());
				}
				
//			Sistema de busca
			} else if (T == 3) {
				System.out.println("\nDigite o salario: ");
				double busca = sc.nextDouble();
				System.out.println("Nome\tOcupacao\tCPF\tIdade\tSalario");
				for (Funcionario f : cadastro.busca(busca)) {
					System.out.println(f);
				}
				//System.out.println(cadastro.busca(busca).toString()); 
				
			} else if (T == 4){
				System.out.println("Digite seu login e senha de administrador");
				System.out.println("login: ");
				String login = sc.next();
				System.out.println("senha: ");
				String senha = sc.next();
				if (cadastro.verificaAdmin(login, senha)) {
					System.out.println("Digite o nome do funcionario à ser removido");
					cadastro.busca(sc.next());
					
				}
			}
			else System.out.println("Valor invalido!");
		}
		sc.close();
	}
	
}

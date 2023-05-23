package funcionario.main;



import java.util.Scanner;
import funcionario.modelo.CadastroFuncionario;
import funcionario.modelo.Funcionario;

public class Programa {

	public static void main(String[] args) {
//		Instanciação de objetos
		Scanner sc = new Scanner(System.in);
		CadastroFuncionario cadastro = new CadastroFuncionario();
		
//		Algoritimo para registrar 7 objetos
		for (int i = 0; i < 7; i++) {
			String nome = "f"+i;
			String ocupacao = "o"+i;
			
			cadastro.registraFuncionario(new Funcionario(nome, ocupacao, Integer.toString(i), i, (double) i));
		}
		
		int T = Integer.MIN_VALUE;
		while (T != 0) {
			System.out.println("1- Cadastro de funcionario / 2- Listar funcionarios / 3 - Busca por salario / 0- Sair");
			System.out.println("Insira a opcao: ");
			T = sc.nextInt();
			
//			Mensagem de encerramento do sistema
			if (T == 0) System.out.println("Sistema encerrado.");
			
//			Menu de cadstro de funcionario
			else if (T == 1) {
				System.out.println("*Castro de funcionario*");
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
				System.out.println("Lista:\nNome\t\tOcupacao\tSalario");
				for (int i = 0; i < cadastro.qntdFuncionarios(); i++) {
					Funcionario f = cadastro.getFuncionario(i);
					System.out.println(f.getNome() + "\t\t" + f.getOcupacao() + "\t\t" + f.getSalario());
				}
				
//				Sistema de busca
			} else if (T == 3) {
				System.out.println("Digite o salario: ");
				cadastro.busca(sc.nextDouble());
				
			} else System.out.println("Valor invalido!");
		}
		sc.close();
	}
	
}

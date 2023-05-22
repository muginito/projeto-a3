package funcionario.main;


import java.util.ArrayList;
import java.util.Scanner;

import funcionario.modelo.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		int saida = Integer.MIN_VALUE;
		
		for (int i = 0; i < 7; i++) {
			String nome = "f"+i;
			String ocupacao = "o"+i;
			
			funcionarios.add(new Funcionario(nome, ocupacao, Integer.toString(i), i, (double) i));
		}
		
		while (saida != 0) {
			System.out.println("1- Cadastro de funcionario\n2- Listar funcionarios\n 0- Sair");
			if (sc.nextInt() == 1) {
				System.out.println("Digite o nome do funcionario: ");
				String nome = sc.nextLine();
				System.out.println("Digite a ocupacao: ");
				String ocupacao = sc.nextLine();
				System.out.println("Digite o CPF: ");
				String cpf = sc.nextLine();
				System.out.println("Digite a idade");
				int idade = sc.nextInt();
				System.out.println("Digite o salario");
				double salario = sc.nextDouble();
				
				funcionarios.add(new Funcionario(nome, ocupacao, cpf, idade, salario));
				
			} else if (sc.nextInt() == 2) {
				for (int i = 0; i < funcionarios.size(); i++) {
					System.out.println(funcionarios.get(i));
				}
			} else System.out.println("Valor invalido!");
		}
	}
	
}

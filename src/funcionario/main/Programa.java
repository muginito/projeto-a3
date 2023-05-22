package funcionario.main;


import java.util.ArrayList;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

import funcionario.modelo.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		int saida = Integer.MIN_VALUE;
		
		//String cpf = rnd.nextInt(9) +
		
		for (int i = 0; i < 7; i++) {
			String nome = "f"+i;
			String ocupacao = "o"+i;
			
			funcionarios.add(new Funcionario(nome, ocupacao, Integer.toString(i), i, (double) i));
		}
		
		while (saida != 0) {
			System.out.println("1- Cadastro de funcionario / 2- Listar funcionarios / 0- Sair");
			System.out.println("Insira a opcao: ");
			saida = sc.nextInt();
			if (saida == 1) {
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
				
				funcionarios.add(new Funcionario(nome, ocupacao, cpf, idade, salario));
				
			} else if (saida == 2) {
				System.out.println("Lista:\nNome\t\tOcupacao\tSalario");
				for (int i = 0; i < funcionarios.size(); i++) {
					Funcionario f = funcionarios.get(i);
					System.out.println(f.getNome() + "\t\t" + f.getOcupacao() + "\t\t" + f.getSalario());
				}
			} else if (saida == 0) System.out.println("Encerrando sistema.");
			else System.out.println("Valor invalido!");
		}
		sc.close();
	}
	
}

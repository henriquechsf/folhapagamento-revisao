package folha_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		
		int opcao = 0;
		int contId = 0;
		
		do {
			System.out.println("|###########################|");
			System.out.println("|           MENU            |");
			System.out.println("|---------------------------|");
			System.out.println("|[1] Cadastrar funcionário  |");
			System.out.println("|[2] Calcular folha         |");
			System.out.println("|[3] Sair                   |");
			
			opcao = ler.nextInt();
			
			switch (opcao) {
			case 1:
				// cadastrar
				contId++;
				
				funcionarios.add(CadastroFuncionario.cadastrar(contId, ler));
				System.out.println("Usuário cadastrado com sucesso!");
				
				// lambda
				funcionarios.forEach(func -> {
					System.out.println(func.getNome());
				});
				
				break;
			case 2:
				// calcular
				
				
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		} while (opcao != 3);
		
		
		ler.close();
	}

}

package folha_project;

import java.util.List;
import java.util.Scanner;

public class EmissaoHolerite {
	
	public static List<Holerite> emitirHolerite(List<Funcionario> funcionarios, Scanner ler) {
	
		System.out.println("Id Inicio");
		Long idInicio = ler.nextLong();
		
		System.out.println("Id Fim");
		Long idFim = ler.nextLong();
		
		System.out.println("[1] Salário");
		System.out.println("[1] Férias");
		System.out.println("[1] 13º Salário");
		int opcao = ler.nextInt();
		
		switch (opcao) {
		case 1:
			// calculo salario
			funcionarios.forEach(func -> {
				if (func.getId() >= idInicio && func.getId() <= idFim) {
					System.out.println(func.getNome());
				}
			});
			
			break;
		case 2:
			// calculo ferias
			
			break;
		case 3:
			// calculo 13º
			
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		return null;
	}
}	

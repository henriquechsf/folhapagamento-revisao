package folha_project;

import java.util.List;
import java.util.Scanner;

public class EmissaoHolerite {
	
	public static List<Holerite> emitirHolerite(List<Funcionario> funcionarios, Scanner ler) {
	
		System.out.println("Id Inicio");
		Long idInicio = ler.nextLong();
		
		System.out.println("Id Fim");
		Long idFim = ler.nextLong();
		
		System.out.println("[1] Sal�rio");
		System.out.println("[1] F�rias");
		System.out.println("[1] 13� Sal�rio");
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
			// calculo 13�
			
			break;
		default:
			System.out.println("Op��o inv�lida!");
			break;
		}
		
		return null;
	}
}	

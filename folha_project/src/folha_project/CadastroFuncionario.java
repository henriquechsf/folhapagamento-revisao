package folha_project;

import java.util.Scanner;

public class CadastroFuncionario {
	
	// metodos
	public static Funcionario cadastrar(int contId, Scanner ler) {
		Funcionario funcionario = new Funcionario(new Long(contId));
		
		System.out.println("| Nome do funcion�rio:      |");
		String nome = ler.next();
		System.out.println("| S�lario base: ");
		double salario = ler.nextDouble();
		
		return funcionario;
	}
}

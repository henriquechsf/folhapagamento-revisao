import java.util.Scanner;

public class CadastroFuncionario {
	
	public static Funcionario cadastrar(int contId, Scanner ler) {
		Funcionario funcionario = new Funcionario(new Long(contId));
		
		System.out.println("Nome do funcionário: ");
		funcionario.setNome(ler.next());
		System.out.println("Salário: ");
		funcionario.setSalario(ler.nextDouble());
		
		return funcionario;
	}
	
}

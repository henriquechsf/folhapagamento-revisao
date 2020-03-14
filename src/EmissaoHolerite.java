import java.util.List;
import java.util.Scanner;

public class EmissaoHolerite {
	
	public EmissaoHolerite() {
		
	}
	
	public static List<Holerite> emitirHolerite(List<Funcionario> funcionarios, Scanner ler) {
		System.out.println("\nID inicio: ");
		Long idInicio = ler.nextLong();
		System.out.println("\nID Fim");
		Long idFim = ler.nextLong();
		
		System.out.println("Competência: ");
		Integer competencia = ler.nextInt();
		
		System.out.println("[1] Salario");
		System.out.println("[1] Férias");
		System.out.println("[1] 13º Salário");
		int opcao = ler.nextInt();
		
		switch (opcao) {
		case 1:
			Calculo calculo = new CalculoSalario();
			return calculo.calcular(funcionarios, idInicio, idFim, competencia);
		
		case 2:
			
			break;
		case 3:
			
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		return null;
	}
}

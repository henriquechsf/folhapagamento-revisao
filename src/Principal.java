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
				
				EmissaoHolerite.emitirHolerite(funcionarios, ler).forEach(holerite -> {
					System.out.println("-------" + holerite.getTipoFolha() + "-------");
					System.out.println("Funcionário: " + holerite.getFuncionario().getNome());
					System.out.println("Salário: " + holerite.getFuncionario().getSalario());
					System.out.println("Competência: " + holerite.getCompetencia());
					holerite.getEventos().forEach(evento -> {
						System.out.println(evento.toString());
					});
					
					System.out.println("Vencimentos: R$" + holerite.getVencimentos());
					System.out.println("Descontos: R$" + holerite.getDescontos());
					System.out.println("Total: R$" + holerite.getTotal());
					
					System.out.println("---");
				});
				
				break;
			case 3:
				// sair
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
		} while(opcao != 3);
		
		ler.close();
	}

}

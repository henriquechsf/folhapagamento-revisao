import java.util.List;

public interface Calculo {
	Holerite calcular(Funcionario func, Integer competencia);
	
	List<Holerite> calcular(List<Funcionario> funcionarios, 
			Long idInicio, Long idFim, Integer competencia);
}

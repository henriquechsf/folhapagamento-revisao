package folha_project;

import java.util.List;

public class Holerite {
	private Long id;
	private Funcionario funcionario;
	private TipoFolha tipoFolha;
	private Integer competencia;
	private List<Evento> eventos;

	
	// get set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public TipoFolha getTipoFolha() {
		return tipoFolha;
	}

	public void setTipoFolha(TipoFolha tipoFolha) {
		this.tipoFolha = tipoFolha;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

}

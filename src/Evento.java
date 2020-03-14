
public class Evento {
	private String descricao;
	private Double valor;
	private TipoEvento tipoEvento;
	
	public Evento() {
		// TODO Auto-generated constructor stub
	}
	
	public Evento(String descricao, Double valor, TipoEvento tipoEvento) {
		this.descricao = descricao;
		this.valor = valor;
		this.tipoEvento = tipoEvento;
	}

	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return descricao + " - R$" + valor;
	}

}

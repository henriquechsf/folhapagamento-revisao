package folha_project;

public class Funcionario {
	// atributes
	private Long id;
	private String nome;
	private Double salario;
	
	// construtor
	public Funcionario() {
		
	}
	public Funcionario(Long id) {
		this.id = id;
	}
	
	
	// getter and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}

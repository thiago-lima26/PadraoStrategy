package PadraoStrategy;

public class Funcionario {
	static final String DESENVOLVEDOR = "Desenvolvedor";
	static final String DBA = "DBA";
	static final String GERENTE = "Gerente";
	private String nome;
	private String cargo;
	private String salarioBase;
	private CalculoSalario tipo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(String salarioBase) {
		this.salarioBase = salarioBase;
	}

	public CalculoSalario getTipo() {
		return tipo;
	}

	public void setTipo(CalculoSalario tipo) {
		this.tipo = tipo;
	}

	public Funcionario(String cargo, String salarioBase) {
		this.salarioBase = salarioBase;
		switch (cargo) {
		case DESENVOLVEDOR:
			tipo = new Desenvolvedor();
			cargo = DESENVOLVEDOR;
			break;
		case DBA:
			tipo = new DBA();
			cargo = DBA;
			break;
		case GERENTE:
			tipo = new Gerente();
			cargo = GERENTE;
			break;
		default:
			throw new RuntimeException("Cargo não encontrado");
		}
	}
	
	public String calcularSalario() {
		return tipo.calculaSalario(this);
	}
}
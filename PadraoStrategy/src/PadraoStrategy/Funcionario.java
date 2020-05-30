package PadraoStrategy;

import java.text.DecimalFormat;

public class Funcionario {
	static final String DESENVOLVEDOR = "Desenvolvedor";
	static final String DBA = "DBA";
	static final String GERENTE = "Gerente";
	private String nome;
	private String cargo;
	private double salarioBase;
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

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public CalculoSalario getTipo() {
		return tipo;
	}

	public void setTipo(CalculoSalario tipo) {
		this.tipo = tipo;
	}

	public Funcionario(String cargo, double salarioBase) {
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
	
	public double calcularSalario() {
		return tipo.calculaSalario(this);
	}
	
	public double calculoImposto() {
		if(calcularSalario()>=1900 && calcularSalario()<=2800) {
			this.salarioBase = calcularSalario() * 0.925;
		}else if(calcularSalario()>2800 && calcularSalario()<=3700) {
			this.salarioBase = calcularSalario() * 0.85;
		} else if(calcularSalario()>3700 && calcularSalario()<=4600) {
			this.salarioBase = calcularSalario() * 0.775;
		}else if(calcularSalario()>4600) {
			this.salarioBase = calcularSalario() * 0.725;
		} else 
			this.salarioBase = calcularSalario();
		return this.salarioBase;
	}
}
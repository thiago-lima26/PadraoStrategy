package PadraoStrategy;

public class Gerente implements CalculoSalario {
	@Override
	public double calculaSalario(Funcionario funcionario) {
		return funcionario.getSalarioBase() * 1.35;
	}
}

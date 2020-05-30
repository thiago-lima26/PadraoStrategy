package PadraoStrategy;

public class Desenvolvedor implements CalculoSalario {

	@Override
	public double calculaSalario(Funcionario funcionario) {
        return funcionario.getSalarioBase() * 1.15;
	}

}

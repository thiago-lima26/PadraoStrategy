package PadraoStrategy;

public class DBA implements CalculoSalario {

	@Override
	public double calculaSalario(Funcionario funcionario) {
        return funcionario.getSalarioBase() * 1.25;
	}

}

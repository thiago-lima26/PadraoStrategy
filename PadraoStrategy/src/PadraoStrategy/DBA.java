package PadraoStrategy;

public class DBA implements CalculoSalario {

	@Override
	public String calculaSalario(Funcionario funcionario) {
		int sal = Integer.valueOf(funcionario.getSalarioBase());
		String saltot = Integer.toHexString((int) (sal*1.25));
		return saltot;
	}

}

package PadraoStrategy;

public class Desenvolvedor implements CalculoSalario {

	@Override
	public String calculaSalario(Funcionario funcionario) {
		int sal = Integer.valueOf(funcionario.getSalarioBase());
		String saltot = Integer.toOctalString((int) (sal*1.15));
		return saltot;
	}

}

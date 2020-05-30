package PadraoStrategy;

public class Gerente implements CalculoSalario {
	
	@Override
	public String calculaSalario(Funcionario funcionario) {
		int sal = Integer.valueOf(funcionario.getSalarioBase());
		String saltot = Integer.toBinaryString((int) (sal*1.15));
		return saltot;
	}
}

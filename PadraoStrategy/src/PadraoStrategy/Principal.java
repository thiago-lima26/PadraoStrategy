package PadraoStrategy;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Cargo\t\t Oct/Hex/Bin \t\tSalário");
	
		//Funcionário1 recebe um adicional de 15%
		Funcionario funcionario1 = new Funcionario(Funcionario.DESENVOLVEDOR, "1652"); 
		System.out.println(Funcionario.DESENVOLVEDOR + " :\tR$ " + funcionario1.calcularSalario() + "\t\t\tR$ " + Integer.parseInt(funcionario1.calcularSalario(), 8));
		
		//Funcionário2 recebe um adicional de 25%
		Funcionario funcionario2 = new Funcionario(Funcionario.DBA, "2800");
		System.out.println(Funcionario.DBA + " : \t\tR$ " + funcionario2.calcularSalario() + "\t\t\tR$ " + Integer.parseInt(funcionario2.calcularSalario(), 16) );
		
		//Funcionário3 recebe um adicional de 35%
		Funcionario funcionario3 = new Funcionario(Funcionario.GERENTE, "3900");
		System.out.println(Funcionario.GERENTE + " : \tR$ " + funcionario3.calcularSalario() + "\tR$ " + Integer.parseInt(funcionario3.calcularSalario(), 2) );
	}

}

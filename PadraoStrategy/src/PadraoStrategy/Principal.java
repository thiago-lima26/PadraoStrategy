package PadraoStrategy;

import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("0.00");
		
		System.out.println("Cargo\t\t Sal�rio Bruto \t Sal�rio L�quido");
		
		//Funcion�rio1 recebe 15% a mais - esse adicional depende do cargo de cada um 
		Funcionario funcionario1 = new Funcionario(Funcionario.DESENVOLVEDOR, 1652);
		System.out.println(Funcionario.DESENVOLVEDOR + " :\tR$ " + f.format(funcionario1.calcularSalario()) + " - c/ dedu��es: R$ " + f.format(funcionario1.calculoImposto()));
		
		//Funcion�rio2 recebe 25% a mais - esse adicional depende do cargo de cada um
		Funcionario funcionario2 = new Funcionario(Funcionario.DBA, 2800);
		System.out.println(Funcionario.DBA + " : \t\tR$ " + f.format(funcionario2.calcularSalario()) + " - c/ dedu��es: R$ " + f.format(funcionario2.calculoImposto()));
		
		//Funcion�rio3 recebe 35% a mais - esse adicional depende do cargo de cada um
		Funcionario funcionario3 = new Funcionario(Funcionario.GERENTE, 3900);
		System.out.println(Funcionario.GERENTE + " : \tR$ " + f.format(funcionario3.calcularSalario()) + " - c/ dedu��es: R$ "+ f.format(funcionario3.calculoImposto()));
	
		//E ainda tem o desconto do Imposto Renda pra quem recebbe acima de R$ 1900,00 
	}

}

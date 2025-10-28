package q1L5;

public class Vendedor extends SuperclasseFuncionario{
	
	private int totalDeVendas;
	
	public Vendedor(String nome, double salario,int totalDeVendas ) {
		super(nome, salario);
		this.totalDeVendas=totalDeVendas;
	}

	public int getTotalDeVendas() {
		return totalDeVendas;
	}

	public void setTotalDeVendas(int totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}
//metodos
	

	public double calcularBonus(String nome, double salario) {
		
		double bonus=salario*0.05;
		salario=salario+bonus;
		return bonus;
	}
	public void dadosRH() {
		super.dadosRH();
		System.out.println("Total de Vendas: "+totalDeVendas);
	}
	
}

package q1L5;

public class SuperclasseFuncionario {
	
	private String nome;
	private double salario;
	
	protected SuperclasseFuncionario(String nome, double salario ) {
		this.nome=nome;
		this.salario=salario;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}
	
	//metodos
	
	public double calcularBonus() {
		double bonus=salario*0.10;
		salario=salario+bonus;
		return bonus;
	}
	public void dadosRH() {
		
		
		System.out.println("Nome: "+nome);
		System.out.println("Salario: "+salario);
		System.out.println("Bonus: "+ calcularBonus());
		System.out.println("");
	}
}

package q1L5;

public class Gerente extends SuperclasseFuncionario {
	
	//não há atributos
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	//metodos
	
	public double calcularBonus(String nome, double salario) {
		
		double bonus=salario*0.15;
		salario=salario+bonus;
		return bonus;
	}
	public void dadosRH() {
		super.dadosRH();
	}
}

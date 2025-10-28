package q11.copy;

public class SuperContaBancaria {

	private double numeroDaConta;
	private double saldo;
	
	public SuperContaBancaria(int numeroDaConta,double saldo) {
		
		this.numeroDaConta=numeroDaConta;
		this.saldo=saldo;
	}
	
	
	
	protected double getNumeroDaConta() {
		return numeroDaConta;
	}



	protected void setNumeroDaConta(double numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}



	protected double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


//metodos
	public void sacar(int valor) {
		
		
		if(valor>saldo) {
			System.out.println("Saldo insuficiente");
		}
		else {
			this.saldo=saldo-valor;
			System.out.println("Saldo final: "+saldo);
		}
		
		
	}
	
	public  void depositar(int valor) {
		this.saldo=saldo+valor;
		System.out.println("Saldo final pos deposito: "+saldo);
		
		}
	
	public void checarConta() {
		System.out.println("Numero da Conta: "+ numeroDaConta);
		System.out.println("Saldo:"+ saldo);
	}
	
	
}

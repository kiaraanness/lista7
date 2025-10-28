package q11.copy;

public class ContaPoupanca extends SuperContaBancaria {
	
	private double taxaDeRendimento;
	
	public ContaPoupanca(int numeroDaConta,double saldo,double taxaDeRendimento) {
		
		super(numeroDaConta,saldo);
		this.taxaDeRendimento=taxaDeRendimento;
	}

	public double getTaxaDeRendimento() {
		return taxaDeRendimento;
	}

	public void setTaxaDeRendimento(double taxaDeRendimento) {
		this.taxaDeRendimento = taxaDeRendimento;
	}
	
	//metodos
	
	public void calcularNovoSaldo() {
		
		double saldo= (getSaldo()*taxaDeRendimento/100)+ getSaldo();
	}
	public void checarConta() {
		
		super.checarConta();
		System.out.println("Taxa de rendimento: "+taxaDeRendimento);
	}
	
	

}

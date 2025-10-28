package q11.copy;

public class ContaCorrente extends SuperContaBancaria  {
	
	private double limiteChequeEspecial;
	
	public ContaCorrente(int numeroDaConta,double saldo,double limiteChequeEspecial ) {
		
		super(numeroDaConta,saldo);
		this.limiteChequeEspecial=limiteChequeEspecial;
	}
	
	
public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}


	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

//metodos
public void sacar(double valor) {
		
		
		if(valor>getSaldo()+limiteChequeEspecial) {
			
			System.out.println("Saldo insuficiente");
		}
		else {
			double saldo=getSaldo()-valor;
			System.out.println("Saldo final: "+saldo);
		}
}
		
		public void checarConta() {
			super.checarConta();
			System.out.println("Limite Cheque Especial:"+limiteChequeEspecial);
		}
		

}


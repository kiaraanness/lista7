package q11.copy;

public class ExecutaBanco {

	public static void main(String[] args) {
		
		ContaCorrente cc1 =new ContaCorrente(1234, 133.50 , 800.98);
		ContaPoupanca cp2=new ContaPoupanca(5679, 500.00, 0.2);
		
		System.out.println("Conta Corrente");
		cc1.sacar(10);
		cc1.checarConta();
		
		System.out.println("");
		
		System.out.println("Conta Poupança");
		cp2.calcularNovoSaldo();
		cp2.checarConta();
		
		
	}

}

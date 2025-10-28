package q1L5;

public class ExecutaFuncionario {

	public static void main(String[] args) {
		
		SuperclasseFuncionario fQualquer= new SuperclasseFuncionario("Juca",13000.00);
		SuperclasseFuncionario gerente= new SuperclasseFuncionario("Joana", 1000000.00);
		SuperclasseFuncionario vendedor= new SuperclasseFuncionario("Oliver", 2000000.00);
		
		SuperclasseFuncionario[] empresa= {fQualquer,gerente,vendedor};
		
		for(SuperclasseFuncionario e :empresa) {
			e.dadosRH();
			
		}

	}

}

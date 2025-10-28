package q1;

public class  Cachorro extends SuperCAnimal {
	
	private String raca;
	
	public Cachorro(String nome,int idade,String raca) {
		
		super(nome,idade);
		this.raca=raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
public void emitirSom() {
		
		System.out.println("AU AU");
	}

public void abanarRabo() {
	System.out.println("O cachorro esta abanando o rabinho!");
}
	

}

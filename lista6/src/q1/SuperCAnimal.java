package q1;

public class SuperCAnimal {
	
	private String nome;
	private int idade;
	
	public SuperCAnimal(String nome,int idade) {
		
		this.idade=idade;
		this.nome=nome;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}
	
	protected void emitirSom() {
		
		System.out.println("O animal está emitindo som");
	}

}


package q1;

public class Gato extends SuperCAnimal {
	
	private int vidas;
	
	
	public Gato(String nome,int idade,int vidas) {
		
		super(nome,idade);
		this.vidas=vidas;
		
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}


	
public void emitirSom() {
		
		System.out.println("Miau Miau Brrrrr");
	}
public void tomarBanho() {
System.out.println("O gato esta se lambendo!");
}
 public void perderVidas(int quantidade) {
	 
	 this.vidas=vidas-quantidade;
	 
	 
	 if(vidas<=0) {
		 
		 System.out.println("O gatinho partiu dessa para a melhor!");
	 }
	 else {
		 System.out.println("O Gato tem: "+vidas+" vidas restantes ");
	 }
	
}
}
	
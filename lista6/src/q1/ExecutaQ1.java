package q1;

public class ExecutaQ1 {

	public static void main(String[] args) {
		
		Cachorro c=new Cachorro("Koda",3,"Shih-Tzu");
		Gato g=new Gato("Caramelo",9,10);
		
		

		System.out.println("Cachorro");
		c.emitirSom();
		c.abanarRabo();
		
		System.out.println("");
		
		System.out.println("Gato");
		g.emitirSom();
		g.tomarBanho();
		g.perderVidas(7);

	}

}

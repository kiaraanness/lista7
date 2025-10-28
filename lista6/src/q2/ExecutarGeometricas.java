package q2;



	public class ExecutarGeometricas {

		public static void main(String[] args) {
			Retangulo r = new Retangulo(2,4);
			
			
			Retangulo formas[] = new Retangulo [2];
			formas[0] =  r;
			
			for(int i = 0; i < 2; i++) {
				System.out.println(formas[i].calcularArea());
				System.out.println(formas[i].calcularPerimetro());
			}

		}
	}

	

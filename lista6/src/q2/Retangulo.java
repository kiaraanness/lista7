package q2;

public class Retangulo extends SuperFormaGeometrica{
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		System.out.println("=====================================");
		double area = base * altura;
		System.out.println("\nÁrea do Retangulo: ");
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = (2* (base + altura));
		System.out.println("Perímetro do Retangulo: ");
		return perimetro;
	}

}

package q2;

public class Circulo extends SuperFormaGeometrica {
private double raio;
public double calcularArea() {
double area = (3.14 * raio * raio);
return area;
}
public double calcularPerimetro() {
double perimetro = (2 * 3.14 *raio);
return perimetro;
}
}
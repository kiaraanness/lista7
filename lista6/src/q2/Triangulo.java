package q2;

public class Triangulo {
private double base;
private double altura;
private double ladoA;
private double ladoB;
private double ladoC;
public double calcularArea() {
double area = (base * altura) / 2;
return area;
}
public double calcularPerimetro() {
double perimetro = ladoA + ladoB + ladoC;
return perimetro;
}
}

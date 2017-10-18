package ex1;

public class Calculo {
	public double x1(double a, double b, double c){
		double delta = 0;
		double x1 = 0;
		double x2 = 0;
		delta = Math.pow(b, 2) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		return x1;
	}
	
	public double x2(double a, double b, double c){
		double delta = 0;
		double x1 = 0;
		double x2 = 0;
		delta = Math.pow(b, 2) - 4 * a * c;
		x1 = (-b - Math.sqrt(delta)) / (2 * a);
		return x2;
	}
}

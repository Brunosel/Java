package metodos;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		System.out.println("Digite o primeiro valor: ");
		double a = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double b = scan.nextDouble();
		
		somar(a, b);
		subtrair(a, b);
		dividir(a, b);
		multiplicar(a, b);
	}
	
	static Scanner scan = new Scanner(System.in);
	
	static void somar(double a, double b) {
		double result = a + b;
		System.out.println("A soma de " + a + " e " + b + " � " + result);
	}
	static void subtrair(double a, double b) {
		double result = a - b;
		System.out.println("A subtra��o de " + a + " e " + b + " � " + result);
	}
	static void dividir(double a, double b) {
		double result = a / b;
		System.out.println("A divis�o de " + a + " e " + b + " � " + result);
	}
	static void multiplicar(double a, double b) {
		double result = a * b;
		System.out.println("A multiplica��o de " + a + " e " + b + " � " + result);
	}

}

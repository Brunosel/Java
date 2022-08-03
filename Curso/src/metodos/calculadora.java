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
		System.out.println("A soma de " + a + " e " + b + " é " + result);
	}
	static void subtrair(double a, double b) {
		double result = a - b;
		System.out.println("A subtração de " + a + " e " + b + " é " + result);
	}
	static void dividir(double a, double b) {
		double result = a / b;
		System.out.println("A divisão de " + a + " e " + b + " é " + result);
	}
	static void multiplicar(double a, double b) {
		double result = a * b;
		System.out.println("A multiplicação de " + a + " e " + b + " é " + result);
	}

}

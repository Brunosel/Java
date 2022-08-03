package metodos;

import java.util.Scanner;

public class emprestimo {

	public static void main(String[] args) {
		
		System.out.println("Digite o valor do emprestimo: ");
		double a = scan.nextDouble();
		System.out.println("Digite o valor de parcelas: ");
		int b = scan.nextInt();
		System.out.println(emprestimo(a, b));
	}
	static Scanner scan = new Scanner(System.in);
	
	static double emprestimo(double price, int installments) {
		double rate = getRate(installments);
		System.out.println((price / installments) * rate);
		return installments * ((price / installments) * rate);	
	}
	
	static double getRate(int installments) {
		switch (installments) {
		case 1: 
			return 1;
		case 2: 
			return 1.2;
		case 3: 
			return 1.3;
		case 4: 
			return 1.4;		
		}
		if (installments > 4) {
			return 1.5;
		} else {
			return 1;
		}
	}

}

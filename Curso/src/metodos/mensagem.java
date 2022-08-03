package metodos;

import java.util.Scanner;

public class mensagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hora do dia: ");
		int time = scan.nextInt();
	
		mensagemHoras(time);
	}
	
	static Scanner scan = new Scanner(System.in);
	
	static public void mensagemHoras(int time) {
		if ( time >= 0 && time < 24) {
			if ( time <= 12) {
				System.out.println("Bom Dia!");
			} else if (time > 12 && time < 18) {
				System.out.println("Boa Tarde!");
			} else if (time >= 18) {
				System.out.println("Boa Noite!");
			}
		}
		
	}

}

package controle;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String conceito = "";
		System.out.print("Digite a Nota  : ");
		int nota =  entrada.nextInt();
		switch(nota) {
		case 10 : case 9 :
			conceito = "A";
			System.out.printf("Nota  =  %d \nConceito =  %s ", nota, conceito);
			break;
		case 8 :case 7 :
			conceito = "B";
			System.out.printf("Nota  =  %d \nConceito =  %s ", nota, conceito);
			break;
		case 6 :case 5 :
			conceito = "C";
			System.out.printf("Nota  =  %d \nConceito =  %s ", nota, conceito);
			break;
		default:
			System.out.println("Nota inválida");
		}
		entrada.close();
	}
}

package controle;

import java.util.Scanner;

public class EstruturaIf {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double media = teclado.nextDouble();

		if (media >= 7.0) {
			System.out.println("APROVADO");
		} else if (media >= 5.0 && media < 7.0) {
			System.out.println("EXAME");
		} else {
			System.out.println("REPROVADO");
		}
		teclado.close();

	}
}

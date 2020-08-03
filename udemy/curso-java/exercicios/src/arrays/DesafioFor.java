package arrays;

import java.util.Scanner;

public class DesafioFor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a quantidade de notas a Calculas : ");
		int a = entrada.nextInt();
		double[] notas = new double[a];
		double total = 0;
		int somador = 0;
		int tot = 0;
		for (int i = 0; i < notas.length; i++) {

			double[] notas1 = new double[a];
			System.out.print("Digite a " + (i + 1) + " Nota : ");
			notas1[i] = entrada.nextDouble();
			if (notas1[i] >= 0 && notas1[i] <= 10) {
				notas[i] = notas1[i];
				total += notas[i];
				somador = i;
				tot++;
			} else {
				i = somador;
				System.out.println("Nota Inválida !!!");
			}

		}
		for (double nota : notas) {
			System.out.print(nota + " ");
		}
		System.out.println();
		System.out.println("Quantidade de Notas " + total);
		System.out.println("Valor das Médias =  " + total / tot);
		entrada.close();
	}

}

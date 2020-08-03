package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos alunos ? : ");
		int qtd = entrada.nextInt();

		System.out.print("Quantas notas por aluno ? : ");
		int qtdNotas = entrada.nextInt();

		double[][] notasTurma = new double[qtd][qtdNotas];
		double total = 0;
		System.out.println();
		for (int a = 0; a < notasTurma.length; a++) {
			for (int n = 0; n < notasTurma[a].length; n++) {
				System.out.printf("Informe a ª%d Nota do º%d Aluno : ", (n + 1), (a + 1));
				notasTurma[a][n] = entrada.nextDouble();
				total += notasTurma[a][n];
			}	

		}
		double media = total / qtd * qtdNotas;
		System.out.println(media);

		entrada.close();
	}
}

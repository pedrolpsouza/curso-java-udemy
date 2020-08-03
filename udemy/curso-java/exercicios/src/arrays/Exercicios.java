package arrays;

//import java.util.Arrays;

public class Exercicios {
	public static void main(String[] args) {
		double[] notasAluno = new double[4];
		double[] notasAluno2 = { 1, 2, 3, 4, 5 };
		notasAluno[0] = 7.9;
		notasAluno[1] = 8.1;
		notasAluno[2] = 6;
		notasAluno[3] = 5;
		//String a = Arrays.toString(notasAluno);
		//System.out.println(a);

		double total = 0;
		// int x = 0;
		for (int i = 0; i < notasAluno.length; i++) {
			total += notasAluno[i];
			// x++;
		}

		System.out.println(total);
		System.out.printf("media = %.2f\n \n", total / notasAluno.length);

		for (int i = 0; i < notasAluno2.length; i++) {
			System.out.print("["+ notasAluno2[i] + "]");
		}
	}
}

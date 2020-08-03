package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("Dia");
		System.out.println("\nGood Morning");
		System.out.printf("My Age is %d", 29);
		System.out.printf("%n Testando valores flutuantes R$ %.2f %n", 350.00);
		
		Scanner entrada = new Scanner(System.in);
		Scanner soma = new Scanner(System.in);
		System.out.print("Informe seu nome : ");
		String nome = entrada.nextLine();
		System.out.println("Informe o nome " + nome);
		int a ;
		int b;
		int resultado;
		System.out.print("Informe o valor de A : ");
		a = soma.nextInt();
		System.out.print("Informe o valor de B : ");
		b = soma.nextInt();
		resultado = a + b;
		System.out.println("TOTAL DA SOMA : " + resultado);
		entrada.close();
		soma.close();
		
	}
}

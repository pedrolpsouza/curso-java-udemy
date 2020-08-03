package calculos;

import java.util.Scanner;

public class Somas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a;
		int b;
		System.out.print(" Digite o primeiro valor : ");
		a = entrada.nextInt();
		System.out.print("Digite o segundo valor : ");
		b = entrada.nextInt();
		System.out.println("Resultado da Soma "+ (a+b));
		
		double nota1;
		double nota2;
		System.out.print("Digite a primeira nota : ");
		nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota : ");
		nota2 = entrada.nextDouble();
		double resultado = (nota1+nota2) /2;
		if(resultado >= 7) {
			System.out.println("APROVADO");
			
		}else if(resultado >=4) {
			System.out.println("EXAME");
		}else {
			System.out.println("reprovado");
		}
			entrada.close();
;	}
	
}

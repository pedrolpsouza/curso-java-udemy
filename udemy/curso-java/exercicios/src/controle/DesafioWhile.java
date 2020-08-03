package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in) ;
		double nota = 0 ;
		double contador = 0;
		double total = 0;
		double media = 0;
		
;		while(nota!= -1) {
			System.out.print("Digite a nota : ");
			nota = entrada.nextDouble();
			if(nota >=0 && nota <=10) {
				
				total += nota;
				contador ++;
			}else {
				System.out.print("Nota inválida, digite -1 para sair : ");
				//nota = -1;
			}
		}
	
		 media = total / contador;
		System.out.printf("\nMédia = %.2f ", media);
		System.out.printf("\nContador = %.2f ", contador);
		System.out.printf("\nTotal da soma das notas = %.2f ", total);
		entrada.close();
	}
}

package operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double n1 = entrada.nextDouble();
		String simbolo = entrada.next();
		double n2 = entrada.nextDouble();
		
		System.out.print(n1 + " " + simbolo + " " + n2 + " = " );
		
	
		//System.out.print("Digite o segundo Valor : ");
		
		//System.out.print("Qual operação deseja realizar ? : ");
		
		if(simbolo.equals("+")) {
			double resultado = n1+n2;
			System.out.printf(" %.2f ", resultado);
		}else if(simbolo.equals("-")){
			double resultado = n1-n2;
			System.out.printf(" %.2f ", resultado);
		}else if(simbolo.equals("x")) {
			double resultado = n1*n2;
			System.out.printf(" %.2f ", resultado);
		}else {
			double resultado = n1/n2;
			System.out.printf(" %.2f ", resultado);
		}
		entrada.close();
		
		
	}
}

package fundamentos;

import java.util.Scanner;

public class ConversaoSalario {
	public static void main(String[] args) {
		String salario1;
		String salario2;
		String salario3;
		//-------------------------------------------------------
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro Salario : ");
		salario1 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o Segundo Salario : ");
		salario2 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o Terceiro Salario : ");
		salario3 = entrada.nextLine().replace(",", ".");
		//------------------------------------------------------
		double n1 = Double.parseDouble(salario1);
		double n2 = Double.parseDouble(salario2);
		double n3 = Double.parseDouble(salario3);
		double media = (n1+n2+n3)  / 3;
		
		System.out.printf("A M�dia dos 3 Sal�rios � : %.2f " , media);
		entrada.close();
	}
}

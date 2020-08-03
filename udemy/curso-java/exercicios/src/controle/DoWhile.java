package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		do {
			
			System.out.println(i);
			
			i++;
		}while(i<=10);
			
		entrada.close();
	}
}

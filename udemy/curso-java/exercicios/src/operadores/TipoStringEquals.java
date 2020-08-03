package operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		String  q = "4";
		String qq = "3";
		System.out.println("3" == "3");
		System.out.println(q == qq);
		String s = new String("2");
		System.out.println(s.equals("2"));
		//ou
		System.out.println("2".equals(s));
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next(); //.nextLine() não tira os espaços em branco 
		System.out.print("3".equals(s2.trim())); // trim tira os espaços em branco
		
		entrada.close();
	}
}

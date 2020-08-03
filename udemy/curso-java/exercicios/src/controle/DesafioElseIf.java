package controle;

import java.util.Scanner;

public class DesafioElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o Nome do dia da Semana : ");
		String diaDaSemana = entrada.next();
		
		if(diaDaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		} else if(("segunda".equals(diaDaSemana.toLowerCase()))) {
			System.out.println("2");
		}else if("Terça".equalsIgnoreCase(diaDaSemana) ||"terca".equalsIgnoreCase(diaDaSemana)) {
			System.out.println("3");
		}else if(diaDaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		}else if(diaDaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		}else if(diaDaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
		}else if(diaDaSemana.equalsIgnoreCase("Sábado") || "Sabado".equalsIgnoreCase(diaDaSemana)) {
			System.out.println("7");
		}else {
			System.out.println("Dia Inválido");
		}
		
		entrada.close()
;	}
}

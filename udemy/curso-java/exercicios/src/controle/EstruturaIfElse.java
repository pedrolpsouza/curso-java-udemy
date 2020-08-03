package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EstruturaIfElse {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v1;
		String valor = JOptionPane.showInputDialog("VALOR");
		v1 = Integer.parseInt(valor);
		String operacao = JOptionPane.showInputDialog("INFORME A OPERAÇÃO");
		String valor2 = JOptionPane.showInputDialog("VALOR 2");
		int v2 = Integer.parseInt(valor2);
		
		if (operacao.equals("+")) {
			int resultado = v1 + v2;
			System.out.println(resultado);
		} else if (operacao.equals("-")) {
			int resultado = v1 - v2;
			System.out.println(resultado);
		} else if (operacao.equals("*")) {
			int resultado = v1 * v2;
			System.out.println(resultado);
		} else if (operacao.equals("/")) {
			int resultado = v1 / v2;
			System.out.println(resultado);
		} else {
			System.out.println("OPERAÇÃO INVALIDA");
		}
		teclado.close();
	}
}

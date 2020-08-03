package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro Numero : ");
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo Numero : ");
		
		System.out.println("Concatenando valores " + valor1+valor2);
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		System.out.printf(" Valor da Soma : %.1f %n " , soma);
		System.out.printf("Media =  %.1f %n" , soma/2);
		System.out.println(soma);
		System.out.println("\n" + soma/2);
		//System.out.println(media);
		
		//String a = "35";
		//String b = "45";
		
	}
	
	
}

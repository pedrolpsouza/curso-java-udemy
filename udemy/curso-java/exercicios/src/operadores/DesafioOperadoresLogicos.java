package operadores;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1  ^ trabalho2;
		boolean comprouSorvete = trabalho1 | trabalho2;
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32 ? " +  comprouTV32);
		System.out.println("Comprou Sorvete ? " + comprouSorvete);
		System.out.println("Mais Saud�vel ? " + !comprouSorvete);
	}
}

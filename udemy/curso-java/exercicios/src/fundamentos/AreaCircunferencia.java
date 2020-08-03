package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		//int raio = 3; // atribuicao
		double raio1 = 3.4;
		//final = constante - constante tem q ser com letra maiuscula
		final double PI = 3.14159;
		
		 double area = PI * raio1 * raio1;
		System.out.println("o valor do raio eh " + area);
		raio1 = 10;
		area = PI * raio1 * raio1;
		System.out.println(" novo valor " + area);
	}
}

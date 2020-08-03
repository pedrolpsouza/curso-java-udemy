package fundamentos;

public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		float x = (float) 1.5; // ou float x = 1.5F;
		double a = 1;
		System.out.printf("%.2f,%n%.2f%n", x, a);
		int c = 127;
		byte d = (byte) c; // conversão explicita (CAST) de int pra byte
		System.out.println(d);
		long h = 150232L;
		int n = (int) h; // (EXPLICITA - CAST)long para int
		 System.out.println(n);
		 
		 double xd = 1.5;
		 int xdd = (int)xd; // CAST - ocorre perda de valores
		 System.out.println(xdd);
	}
}
package operadores;

public class OperadoresUnarios {
		public static void main(String[] args) {
			int a = 1;
			int b = 2;
			int c = 3;
			int d = 1;
			int e = 2;
			a++;
			System.out.println(a); //a = a + 1;
			a--;
			System.out.println(a); // a = a - 1;
			b++;
			System.out.println(b);
			b--;
			System.out.println(b);
			++c;
			System.out.println(c);
			System.out.println(++ d == e--); //	
			System.out.println(d);
			System.out.println(e);
		}
}

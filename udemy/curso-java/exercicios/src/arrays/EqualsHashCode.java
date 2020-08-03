package arrays;

public class EqualsHashCode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro";
		u1.email = "pedro.lpsouza@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro";
		u2.email = "pedro.lpsouza@gmail.com";
		
		Usuario u3 = new Usuario();
		
		u3.nome = "LOLZAO";
		u3.email = "pedro.lpsouza@gmail.com";
		//System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u3));
	}
}

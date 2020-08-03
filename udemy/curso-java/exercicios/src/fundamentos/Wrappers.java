package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		//byte 
		//int trez = 3000;
		Byte b = 127;
		Short s = 1000;
		//Integer i = 10000;
		//Long l = 10000000L;
		//convertendo int para string
		Integer convert = Integer.parseInt("3000");
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(convert);
		Boolean bo = false;
		bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		Character c = '#';
		System.out.println(c.toString());
	}
}

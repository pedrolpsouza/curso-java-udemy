package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 1234567;
		System.out.println(num1.toString().length());// primeira forma de converter int para String
		System.out.println((""+ num1).length()); // segunda forma de converter int para String
		
		//exemplo 2
		int num2 = 50000;
		System.out.println((""+ num2).length()); 
		System.out.println(Integer.toString(num2).length()); // lenght() só funciona em String
		// exemplo 3
		Double c = 1234.5678;
		System.out.println(Double.toString(c).length());
		System.out.println(("" + c).length());
	}
	
}
		
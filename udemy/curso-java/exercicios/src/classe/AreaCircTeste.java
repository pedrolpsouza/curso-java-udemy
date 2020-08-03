package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(5.6);
		//a.pi = 10;
		//AreaCirc.pi = 3.1415;
		System.out.println(a.area());
		System.out.println(a.area(5.6));
	}
}

package arrays;

public class Foreach {
	public static void main(String[] args) {
		double[] a = { 9.2, 6.8, 3.9, 8.8, 7.6 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		for (double as : a) {
			System.out.print(as + " ");
		}

	}
}

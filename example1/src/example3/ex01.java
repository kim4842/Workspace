package example3;

public class ex01 {

	public static void main(String[] args) {
		int a = 3;
		System.out.println("a = " + a);
		
		a++;
		
		System.out.println("a = " + a);
		
		int c = a++;
		
		
		System.out.println("a = " + a);
		System.out.println("c = " + c);
		
		int d = c++;
		
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		int e = ++d;
		
		System.out.println("d = " + d);
		System.out.println("e = " + e);
	}

}

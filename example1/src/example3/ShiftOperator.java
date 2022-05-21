package example3;

public class ShiftOperator {

	public static void main(String[] args) {
		//산술 시프트 비트 2진법 무시 실무 사용안함
		// @ <<
		System.out.println(3 << 1);
		System.out.println(-3 << 1);
		System.out.println(3 << 2);
		System.out.println(-3 << 2);
		System.out.println();
		
		// @ >>
		System.out.println(5 >> 1);
		System.out.println(-5 >> 1);
		System.out.println(5 >> 2);
		System.out.println(-5 >> 2);
		System.out.println();
		
		// 논리 시프트(>>>)
		System.out.println(3 >>> 1);
		System.out.println(-3 >>> 31);
	}

}

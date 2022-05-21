package example3;

public class AssugnmentOperator {

	public static void main(String[] args) {
		//대입 연산자와 축약 표현
		// @대입 연산자
		int value1 = 3;
//		value1 = value1 + 3;
		value1 += 3;
		System.out.println(value1);
		System.out.println();
		
		//@축약 표현
		int value2;
		
		value2 = 5; System.out.println(value2 += 2);   //value2 = value2 + 2;
		value2 = 5; System.out.println(value2 -= 2);  //value2 = value2 - 2;
		value2 = 5; System.out.println(value2 *= 2);
		value2 = 5; System.out.println(value2 /= 2);
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2); // 정밀 기계 코드 냉장고 전자레인지 비트연산자 10진수 2진수 00100 = 2; 10진수 변환 10
		value2 = 5; System.out.println(value2 <<= 2);
		value2 = 5; System.out.println(value2 >>= 2);
		value2 = 5; System.out.println(value2 >>>= 2); 
	}

}

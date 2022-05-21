package example3;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 삼항 연산자
		int value1 = (3 > 5) ? 6 : 9;     //true , false 참 , 거짓   (조건식) ? 참 : 거짓 ;
		System.out.println(value1);
		
		int value2 = (5 > 3) ? 10 : 20;
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println((value3 % 2 == 0) ? "짝수" : "홀수");    // == (똑같냐)
		System.out.println();
		//cf. if-else 구문으로 변환
		if(value3 % 2 == 0) {
			System.out.println("짝수");
			System.out.println("당첨");
		} else {
			System.out.println("홀수");
			System.out.println("실패");
		}
	}
		
	/*
	 * if(조건식) { 참일떄의 식
	 * 
	 * }else { 거짓일떄의 식
	 * 
	 * }
	 */
}

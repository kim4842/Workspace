package example3;

public class ShiftOperator {

	public static void main(String[] args) {
		//��� ����Ʈ ��Ʈ 2���� ���� �ǹ� ������
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
		
		// �� ����Ʈ(>>>)
		System.out.println(3 >>> 1);
		System.out.println(-3 >>> 31);
	}

}

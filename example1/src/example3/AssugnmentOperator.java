package example3;

public class AssugnmentOperator {

	public static void main(String[] args) {
		//���� �����ڿ� ��� ǥ��
		// @���� ������
		int value1 = 3;
//		value1 = value1 + 3;
		value1 += 3;
		System.out.println(value1);
		System.out.println();
		
		//@��� ǥ��
		int value2;
		
		value2 = 5; System.out.println(value2 += 2);   //value2 = value2 + 2;
		value2 = 5; System.out.println(value2 -= 2);  //value2 = value2 - 2;
		value2 = 5; System.out.println(value2 *= 2);
		value2 = 5; System.out.println(value2 /= 2);
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2); // ���� ��� �ڵ� ����� ���ڷ����� ��Ʈ������ 10���� 2���� 00100 = 2; 10���� ��ȯ 10
		value2 = 5; System.out.println(value2 <<= 2);
		value2 = 5; System.out.println(value2 >>= 2);
		value2 = 5; System.out.println(value2 >>>= 2); 
	}

}

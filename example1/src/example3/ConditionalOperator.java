package example3;

public class ConditionalOperator {

	public static void main(String[] args) {
		// ���� ������
		int value1 = (3 > 5) ? 6 : 9;     //true , false �� , ����   (���ǽ�) ? �� : ���� ;
		System.out.println(value1);
		
		int value2 = (5 > 3) ? 10 : 20;
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println((value3 % 2 == 0) ? "¦��" : "Ȧ��");    // == (�Ȱ���)
		System.out.println();
		//cf. if-else �������� ��ȯ
		if(value3 % 2 == 0) {
			System.out.println("¦��");
			System.out.println("��÷");
		} else {
			System.out.println("Ȧ��");
			System.out.println("����");
		}
	}
		
	/*
	 * if(���ǽ�) { ���ϋ��� ��
	 * 
	 * }else { �����ϋ��� ��
	 * 
	 * }
	 */
}

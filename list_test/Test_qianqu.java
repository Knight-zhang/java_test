package list_test;

import java.util.Scanner;

public class Test_qianqu {

	public static void main(String[] args) throws Exception {
		int n = 10;
		Sqlist1 L = new Sqlist1(80);//�������80���洢��Ԫ�Ŀ�˳���
		for (int i = 0; i < n; i++)
			L.insert(i, i); //˳�����0-9
		System.out.println("������i��ֵ��");
		
		int i = new Scanner(System.in).nextInt();
		if (0 < i && i < n) {
			Object x = L.get(i - 1); //��ȡ˳����е�i��Ԫ�ص�ǰ��
			System.out.println("��" +i + "��Ԫ�ص�ֱ��ǰ���ǣ� " + x);
		} else
			System.out.println("��" + i + "��Ԫ�ص�ֱ��ǰ��������!");
	}

}

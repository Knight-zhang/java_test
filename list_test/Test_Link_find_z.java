package list_test;

import java.util.Scanner;

public class Test_Link_find_z {

	//���ʵ�ֲ������Ա�1��2������n-1���е�i������Ԫ�ص�ֱ��ǰ�����������ֵ��Ҫ���ڵ�������ʵ�֡�
	public static void main(String[] args) throws Exception {
	int n = 10;
	LinkList L = new LinkList();
	for (int i = 0; i < n; i++)
				L.insert(i, i);
			System.out.println("������i��ֵ��");
			int i = new Scanner(System.in).nextInt();
			if (0 < i && i < n) 
				System.out.println("��"+i+"��Ԫ�ص�ֱ��ǰ���ǣ�"+ L.get (i-1));
			else
				System.out.println("��" + i + "��Ԫ�ص�ֱ��ǰ��������!");
		}

}

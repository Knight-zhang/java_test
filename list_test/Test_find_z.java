package list_test;

public class Test_find_z {

	public static void main(String[] args) throws Exception {
		Sqlist1 L = new Sqlist1(10); // ����һ��10���洢�ռ��˳���
		L.insert(0, 'a'); // ��ʼ��������е�ǰ5��Ԫ��
		L.insert(1, 'z');
		L.insert(2, 'd');
		L.insert(3, 'm');
		L.insert(4, 'z');
		int order = L.indexOf('z');
		if (order != -1) // ˳������Ƿ����ֵΪ'z'��Ԫ��
			System.out.println("˳����е�һ�γ��ֵ�ֵΪ'z'������Ԫ�ص�λ��Ϊ��" + order);
		else
			System.out.println("��˳����в�����ֵΪ'z'������Ԫ�أ�");
	}

	
}

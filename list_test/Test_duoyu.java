package list_test;

public class Test_duoyu {

	public static void main(String[] args) throws Exception {
		System.out.println("������10���������е�10�����ֵ��");
		LinkList L =new LinkList(10, true);//������Ϊ10�ĵ�����
		System.out.println("ɾ���ظ����ǰ�������и������ֵΪ��");
		L.display();
		remove(L);
		System.out.println("ɾ���ظ�����������ֵΪ��");// ���
		L.display(); // ���ɾ���ظ��������������е�����Ԫ��
	}
    private static void remove(LinkList L) throws Exception {
		Node p = L.getHead().getNext(), q;
		while (p != null) {
			int order = L.indexOf(p.getData());// p��λ��
			q = p.getNext();
			while (q != null) {
				if (p.getData().equals(q.getData()))
					L.remove(order + 1);
				else
					++order;
				q = q.getNext();
			}
			p = p.getNext();
		}

    }
}

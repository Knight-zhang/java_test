package list_test;
public class DuLNode {
	private Object data;// ��Ž��ֵ
	private DuLNode prior; // ǰ����������
	private DuLNode next; // ��̽�������
	public DuLNode() {// �޲���ʱ�Ĺ��캯��
		this(null);
	}
	public DuLNode(Object data) {// ����ֵΪdata�Ľ��
		this.data = data;
		this.prior = null;
        this.next = null;
    }
//�㷨�����͵�������Ӧ�����㷨һ�£���length( )��get(i)��indexOf(x)
}
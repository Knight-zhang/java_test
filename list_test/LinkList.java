package list_test;

import java.util.Scanner;

public class LinkList implements IList {
	private Node head; //�������ͷָ��
	public LinkList() {
		head = new Node(); // ��ʼ��ͷ���
	}
	public LinkList(int n, boolean Order) throws Exception {
		this();// ��ʼ��ͷ���
		if (Order) // ��β�巨˳����������
			create1(n);
		else // ��ͷ�巨��λ����������
			create2(n);
	}
// β�巨˳����������
	public void create1(int n) throws Exception {
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < n; j++)
			insert(length(), sc.next());// �½������β
	}
	public void create2(int n) throws Exception {
		Scanner sc = new Scanner(System.in);
        for (int j = 0; j < n; j++)
			insert(0, sc.next());// �½����뵽��ͷ
	}
    public void clear() {// �����ÿ�
		head.setData(null);
		head.setNext(null);
	}

    public boolean isEmpty() {
		return head.getNext() == null;// �ж��׽���Ƿ�Ϊ��
	}

	public int length() {// ������Ԫ�ظ���������ֵ
		Node p = head.getNext();
		int length = 0;
		while (p != null) {
			p = p.getNext();
			++length;
		}
		return length;
	}
	public Object get(int i) throws Exception {// ȡֵ
		Node p = head.getNext();// ��ʼ��,pָ���׽��,jΪ������
		int j = 0;
		while (p != null && j < i) {
			p = p.getNext();
			++j;// ������ֵ��1
		}
		if (j > i || p == null) {
			throw new Exception("��"+i+"��Ԫ�ز�����");// ����쳣
		}
		return p.getData();
		}

		public void insert(int i, Object x) throws Exception{//����
			Node p = head;
			int j = -1; 
			while (p != null && j < i - 1) {
				p = p.getNext();
				++j;
			}
			if (j > i - 1 || p == null) // i���Ϸ�
				throw new Exception("����λ�ò�����");// ����쳣
			Node s = new Node(x); // �����½��

	        s.setNext(p.getNext());// ���뵥������
			p.setNext(s);
		}

	public void remove(int i) throws Exception {// ɾ�����
		Node p = head;// ָ��Ҫɾ������ǰ�����
		int j = -1;
	    while (p.getNext() != null && j < i - 1) {
			++j;
		}
		if (j > i - 1 || p.getNext() == null) { 
			throw new Exception("ɾ��λ�ò�����");
		}
			p.setNext(p.getNext().getNext());
		}
	    public int indexOf(Object x) {
		    Node p = head.getNext();
		    int j = 0;
		    while (p != null && !p.getData().equals(x)) {
			    p = p.getNext();
			    ++j;
		    }
		    if (p != null)
			    return j;
		    else
			    return -1;
	    }

	public void display() {
		Node node = head.getNext();
		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
		System.out.println();
	}
    public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
}


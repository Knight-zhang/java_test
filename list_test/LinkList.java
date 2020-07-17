package list_test;

import java.util.Scanner;

public class LinkList implements IList {
	private Node head; //单链表的头指针
	public LinkList() {
		head = new Node(); // 初始化头结点
	}
	public LinkList(int n, boolean Order) throws Exception {
		this();// 初始化头结点
		if (Order) // 用尾插法顺序建立单链表
			create1(n);
		else // 用头插法逆位序建立单链表
			create2(n);
	}
// 尾插法顺序建立单链表
	public void create1(int n) throws Exception {
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < n; j++)
			insert(length(), sc.next());// 新结点插入表尾
	}
	public void create2(int n) throws Exception {
		Scanner sc = new Scanner(System.in);
        for (int j = 0; j < n; j++)
			insert(0, sc.next());// 新结点插入到表头
	}
    public void clear() {// 链表置空
		head.setData(null);
		head.setNext(null);
	}

    public boolean isEmpty() {
		return head.getNext() == null;// 判断首结点是否为空
	}

	public int length() {// 求数据元素个数并返回值
		Node p = head.getNext();
		int length = 0;
		while (p != null) {
			p = p.getNext();
			++length;
		}
		return length;
	}
	public Object get(int i) throws Exception {// 取值
		Node p = head.getNext();// 初始化,p指向首结点,j为计数器
		int j = 0;
		while (p != null && j < i) {
			p = p.getNext();
			++j;// 计数器值增1
		}
		if (j > i || p == null) {
			throw new Exception("第"+i+"个元素不存在");// 输出异常
		}
		return p.getData();
		}

		public void insert(int i, Object x) throws Exception{//插入
			Node p = head;
			int j = -1; 
			while (p != null && j < i - 1) {
				p = p.getNext();
				++j;
			}
			if (j > i - 1 || p == null) // i不合法
				throw new Exception("插入位置不合理");// 输出异常
			Node s = new Node(x); // 生成新结点

	        s.setNext(p.getNext());// 插入单链表中
			p.setNext(s);
		}

	public void remove(int i) throws Exception {// 删除结点
		Node p = head;// 指向要删除结点的前驱结点
		int j = -1;
	    while (p.getNext() != null && j < i - 1) {
			++j;
		}
		if (j > i - 1 || p.getNext() == null) { 
			throw new Exception("删除位置不合理");
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


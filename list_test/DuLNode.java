package list_test;
public class DuLNode {
	private Object data;// 存放结点值
	private DuLNode prior; // 前驱结点的引用
	private DuLNode next; // 后继结点的引用
	public DuLNode() {// 无参数时的构造函数
		this(null);
	}
	public DuLNode(Object data) {// 构造值为data的结点
		this.data = data;
		this.prior = null;
        this.next = null;
    }
//算法描述和单链表相应操作算法一致，如length( )、get(i)和indexOf(x)
}
package list_test;

public class Test_duoyu {

	public static void main(String[] args) throws Exception {
		System.out.println("请输入10个单链表中的10个结点值：");
		LinkList L =new LinkList(10, true);//建立表长为10的单链表
		System.out.println("删除重复结点前单链表中各个结点值为：");
		L.display();
		remove(L);
		System.out.println("删除重复结点后各个结点值为：");// 输出
		L.display(); // 输出删除重复结点后单链表中所有的数据元素
	}
    private static void remove(LinkList L) throws Exception {
		Node p = L.getHead().getNext(), q;
		while (p != null) {
			int order = L.indexOf(p.getData());// p的位置
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

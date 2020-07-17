package list_test;
import java.util.Scanner;
public class Test_merge {

public static void main(String [] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int m = 0,n=0;
		System.out.println("请输入LA结点的个数：");
		m = sc.nextInt();
		System.out.println("请按非递减方式输入"+m+"个数字：");
		LinkList LA = new LinkList(m,true);
		System.out.println("请输入LB结点的个数：");
		n = sc.nextInt();
		System.out.println("请按非递减方式输入"+n+"个数字：");
		LinkList LB = new LinkList(n,true);
		System.out.println("将单链表LA和LB归并后，新的单链表LA中的各个数据元素：");
		mergeList_L(LA,LB).display();
}

public static LinkList mergeList_L(LinkList LA,LinkList LB) {
		Node pa = LA.getHead().getNext();
		Node pb = LB.getHead().getNext();
		Node pc = LA.getHead();
		int da,db;
		while(pa!=null && pb!=null) {
			da = Integer.valueOf(pa.getData().toString());
			db = Integer.valueOf(pb.getData().toString());
			if(da<=db) {
				pc.setNext(pa);
				pc=pa;
				pa=pa.getNext();
			}else {
				pc.setNext(pb);
				pc=pb;
				pb=pb.getNext();
			}
	    }
            pc.setNext(pa!=null?pa:pb);
		      return LA;
}

	
}

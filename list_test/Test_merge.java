package list_test;
import java.util.Scanner;
public class Test_merge {

public static void main(String [] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int m = 0,n=0;
		System.out.println("������LA���ĸ�����");
		m = sc.nextInt();
		System.out.println("�밴�ǵݼ���ʽ����"+m+"�����֣�");
		LinkList LA = new LinkList(m,true);
		System.out.println("������LB���ĸ�����");
		n = sc.nextInt();
		System.out.println("�밴�ǵݼ���ʽ����"+n+"�����֣�");
		LinkList LB = new LinkList(n,true);
		System.out.println("��������LA��LB�鲢���µĵ�����LA�еĸ�������Ԫ�أ�");
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

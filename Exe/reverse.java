package Exe;
import list_test.Sqlist1;
public class reverse {
public static void main(String [] args) throws Exception{
			Sqlist1 l = new Sqlist1(10);
			for(int i=0;i<=8;i++) 
				l.insert(i, i);
				System.out.println("����֮ǰ������ֵΪ��");
				l.display();
				//l.reverse();
				System.out.println("����֮�������ֵΪ��");
				l.display();
	}
}

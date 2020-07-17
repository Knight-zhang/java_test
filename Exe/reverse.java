package Exe;
import list_test.Sqlist1;
public class reverse {
public static void main(String [] args) throws Exception{
			Sqlist1 l = new Sqlist1(10);
			for(int i=0;i<=8;i++) 
				l.insert(i, i);
				System.out.println("逆置之前的数组值为：");
				l.display();
				//l.reverse();
				System.out.println("逆置之后的数组值为：");
				l.display();
	}
}

package Exe;

import list_test.LinkList;

public class Test_charu {

	
		public static void main(String [] args) throws Exception{
			LinkList l = new LinkList( );
			for(int i=0;i<=8;i++) 
				l.insert(i, i);
			System.out.println("����֮ǰ������ֵΪ��");
			l.display();
			//l.insert(2);
			System.out.println("����֮�������ֵΪ��");
			l.display();
		
	}

	
	
}

package Exe;

import list_test.LinkList;

public class Test_charu {

	
		public static void main(String [] args) throws Exception{
			LinkList l = new LinkList( );
			for(int i=0;i<=8;i++) 
				l.insert(i, i);
			System.out.println("插入之前的数组值为：");
			l.display();
			//l.insert(2);
			System.out.println("插入之后的数组值为：");
			l.display();
		
	}

	
	
}

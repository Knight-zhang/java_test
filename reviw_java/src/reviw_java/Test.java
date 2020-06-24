package reviw_java;

public class Test {
	public static void main(String[] args){
		int x = 10;
		int y = 10;
		int z = 10;
		for(x=10;x<15;x++) {
	    	System.out.print("value of x:"+x);
	    	System.out.print("\n");
	    }
		
		
		while(y<15) {
			System.out.print("value of y:"+y);
	    	System.out.print("\n");
	    	y++;
		}
		
		
		do{
			System.out.print("value of z:"+z);
	    	System.out.print("\n");
	    	z++;
		}while(z<15);
		
		int []numbers= {10,20,30,40,50};
		for(int a:numbers) {
			if(a==40) {
				break;
			}
			System.out.print("value of a:"+a);
			System.out.print("\n");
		}
		String [] names = {"a","b","c"};
		for(String name:names) {
			System.out.print("value of name:"+name);
			System.out.print("\n");
		}
		
		 int b = 10;
		 
	      if( b < 20 ){
	         System.out.print("这是 if 语句");
	      }
		
	     
	      int p = 30;
	      int q = 10;
	 
	      if( p == 30 ){
	         if( q == 10 ){
	             System.out.print("P = 30 and Q = 10");
	             System.out.print("\n");
	          }
	      }
          
	      char grade = 'B';
	      switch(grade) {
	          case 'A' :
	        	  System.out.println("优秀");
	        	  //break;
	          case 'B' :
	        	  System.out.println("良好");
	        	  //break;
	          case 'C' :
	        	  System.out.println("及格");
	        	  //break;
	          default:
	        	  System.out.println("未知等级");
	      }
      }
}

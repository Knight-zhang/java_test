package thread;
//求阶乘
public class Xiti1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        int sum = 0;
        int a=1;
        int i = 1;
        while(i<=10) {
        	sum = sum +a;
        	i++;
        	a=a*i;
        }
        System.out.println("sum="+sum);
	}

}

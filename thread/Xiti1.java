package thread;
//��׳�
public class Xiti1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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

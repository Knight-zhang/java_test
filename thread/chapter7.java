package thread;
import java.util.*;
//�û��ڼ������������������֣�ÿ����һ�����ֶ���Ҫ���س���ȷ�ϣ�
//����ڼ�������һ���������ַ���������������������̡�
//���򽫼������Щ���ĺ���ƽ��ֵ��
public class chapter7 {
    public static void main (String args[]){
      Scanner reader = new Scanner(System.in);

      double sum = 0;

       int m = 0;

       while(reader.hasNextDouble()){

           double x = reader.nextDouble();

           assert(x<100):"���ݲ�����";

           m = m+1;

           sum = sum+x;

       }
       
       System.out.printf("%d�����ĺ�Ϊ%f\n",m,sum);

       System.out.printf("%d������ƽ��ֵ��%f\n",m,sum/m);
    }
}

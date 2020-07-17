package thread;
import java.util.*;
//用户在键盘依次输入若干数字，每输入一个数字都需要按回车键确认，
//最后在键盘输入一个非数字字符串结束整个输入操作过程。
//程序将计算出这些数的和与平均值。
public class chapter7 {
    public static void main (String args[]){
      Scanner reader = new Scanner(System.in);

      double sum = 0;

       int m = 0;

       while(reader.hasNextDouble()){

           double x = reader.nextDouble();

           assert(x<100):"数据不合理";

           m = m+1;

           sum = sum+x;

       }
       
       System.out.printf("%d个数的和为%f\n",m,sum);

       System.out.printf("%d个数的平均值是%f\n",m,sum/m);
    }
}

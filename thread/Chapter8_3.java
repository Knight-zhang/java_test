package thread;
import java.util.*;

public class Chapter8_3  {

 public static void main (String args[ ]) {

   int year1,month1,day1,year2,month2,day2;

     try{ year1=Integer.parseInt(args[0]);

          month1=Integer.parseInt(args[1]);

          day1=Integer.parseInt(args[2]);

          year2=Integer.parseInt(args[3]);

          month2=Integer.parseInt(args[4]);

          day2=Integer.parseInt(args[5]);

      }

      catch(NumberFormatException e)

        { year1=2012;

          month1=0;

          day1=1;

          year2=2018;

          month2=0;

          day2=1;

      }

      Calendar calendar=Calendar.getInstance();

      calendar.set(year1,month1-1,day1); 

      long timeYear1=calendar.getTimeInMillis();

      calendar.set(year2,month2-1,day2); 

      long timeYear2=calendar.getTimeInMillis();

      long �������=Math.abs((timeYear1-timeYear2)/(1000*60*60*24));

      System.out.println(""+year1+"��"+month1+"��"+day1+"�պ�"+

                           year2+"��"+month2+"��"+day2+"�����"+�������+"��");

  }

}

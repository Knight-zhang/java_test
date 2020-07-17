package thread;
import java.io.*;

public class Chapter10_1 {

   public static void main(String args[]) {

       File f=new File("E.java");;

       try{   
    	   
    	   RandomAccessFile random=new RandomAccessFile(f,"rw");

              random.seek(0);

              long m=random.length();

              while(m>=0) {

                  m=m-1;

                  random.seek(m);

                  int c=random.readByte();

                  if(c<=255&&c>=0)

                     System.out.print((char)c);

                  else {

                    m=m-1;

                    random.seek(m);

                    byte cc[]=new byte[2];

                    random.readFully(cc);

                    System.out.print(new String(cc));

                  }

              }

       }

       catch(Exception exp){}

    }

}

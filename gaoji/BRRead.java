package gaoji;

//ʹ�� BufferedReader �ڿ���̨��ȡ�ַ�

import java.io.*;

public class BRRead {
  public static void main(String args[]) throws IOException {
      char c;
      // ʹ�� System.in ���� BufferedReader
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("�����ַ�, ���� 'q' ���˳���");//System in ����̨����
      // ��ȡ�ַ�
      do {
          c = (char) br.read();//read��������̨��ȡ��readLine()�Ƕ�ȡ�ַ���
          //���ھ���ʹ���������ɿ���̨����Scanner s = new Scanner(System.in);
          System.out.println(c);
      } while (c != 'q');//ֹͣ����
  }
}

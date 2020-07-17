package gaoji;

//使用 BufferedReader 在控制台读取字符

import java.io.*;

public class BRRead {
  public static void main(String args[]) throws IOException {
      char c;
      // 使用 System.in 创建 BufferedReader
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("输入字符, 按下 'q' 键退出。");//System in 控制台输入
      // 读取字符
      do {
          c = (char) br.read();//read（）控制台读取；readLine()是读取字符串
          //现在经常使用这个来完成控制台输入Scanner s = new Scanner(System.in);
          System.out.println(c);
      } while (c != 'q');//停止方法
  }
}

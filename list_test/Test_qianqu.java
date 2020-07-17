package list_test;

import java.util.Scanner;

public class Test_qianqu {

	public static void main(String[] args) throws Exception {
		int n = 10;
		Sqlist1 L = new Sqlist1(80);//构造具有80个存储单元的空顺序表
		for (int i = 0; i < n; i++)
			L.insert(i, i); //顺序插入0-9
		System.out.println("请输入i的值：");
		
		int i = new Scanner(System.in).nextInt();
		if (0 < i && i < n) {
			Object x = L.get(i - 1); //读取顺序表中第i个元素的前驱
			System.out.println("第" +i + "个元素的直接前驱是： " + x);
		} else
			System.out.println("第" + i + "个元素的直接前驱不存在!");
	}

}

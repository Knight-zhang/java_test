package list_test;

public class Test_find_z {

	public static void main(String[] args) throws Exception {
		Sqlist1 L = new Sqlist1(10); // 构造一个10个存储空间的顺序表
		L.insert(0, 'a'); // 初始化数序表中的前5个元素
		L.insert(1, 'z');
		L.insert(2, 'd');
		L.insert(3, 'm');
		L.insert(4, 'z');
		int order = L.indexOf('z');
		if (order != -1) // 顺序表中是否包含值为'z'的元素
			System.out.println("顺序表中第一次出现的值为'z'的数据元素的位置为：" + order);
		else
			System.out.println("此顺序表中不包含值为'z'的数据元素！");
	}

	
}

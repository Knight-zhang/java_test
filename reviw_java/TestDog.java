package reviw_java;

class F_animal{
	public void move(){
	    System.out.println("��������ƶ�");
	}
}
	 
class Dog extends F_animal{
	public void move(){
	    System.out.println("�������ܺ���");
	}
}
	 
public class TestDog{
	public static void main(String args[]){
	    F_animal a = new F_animal(); // Animal ����
	    F_animal b = new Dog(); // Dog ����
	    Dog c = new Dog();
	    a.move();// ִ�� Animal ��ķ���
	    b.move();//ִ�� Dog ��ķ���
	    c.move();
	}
}
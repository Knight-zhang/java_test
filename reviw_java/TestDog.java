package reviw_java;

class F_animal{
	public void move(){
	    System.out.println("动物可以移动");
	}
}
	 
class Dog extends F_animal{
	public void move(){
	    System.out.println("狗可以跑和走");
	}
}
	 
public class TestDog{
	public static void main(String args[]){
	    F_animal a = new F_animal(); // Animal 对象
	    F_animal b = new Dog(); // Dog 对象
	    Dog c = new Dog();
	    a.move();// 执行 Animal 类的方法
	    b.move();//执行 Dog 类的方法
	    c.move();
	}
}
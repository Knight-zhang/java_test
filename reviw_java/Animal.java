package reviw_java;

public class Animal {
    public String name;
    public int id;
    public Animal(String myname , int myid) {
		name = myname;
    	id = myid;
	}
    public void eat() {
		System.out.println(name+"正在吃");
	}
    
    public void sleep() {
    	System.out.println(name+"正在睡");
	}
    
    public void introduction() {
    	System.out.println("大家好我是"+id+name);
	}
}

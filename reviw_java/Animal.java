package reviw_java;

public class Animal {
    public String name;
    public int id;
    public Animal(String myname , int myid) {
		name = myname;
    	id = myid;
	}
    public void eat() {
		System.out.println(name+"���ڳ�");
	}
    
    public void sleep() {
    	System.out.println(name+"����˯");
	}
    
    public void introduction() {
    	System.out.println("��Һ�����"+id+name);
	}
}

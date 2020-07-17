package reviw_java;

public class Animal_create {
	public static void main(String[] args) {
		Penguin penguin = new Penguin("Jerry", 1);
		System.out.print(penguin.id);
		System.out.print("\n");
		System.out.print(penguin.name);
		System.out.print("\n");
		penguin.eat();
		penguin.sleep();
		penguin.introduction();
		
	}
}

package reviw_java;

public class Puppy {
    int puppyAge;
    public Puppy(String name) {
    	System.out.println("С���������� : " + name ); 
	}
    public void setAge(int age) {
    	puppyAge = age;
    }
    public int getAge() {
    	System.out.println("С��������Ϊ : " + puppyAge ); 
    	return puppyAge;
    }
    
    
    public static void main(String[] args) {
		Puppy myPuppy = new Puppy("Tom");
		myPuppy.setAge(3);
		myPuppy.getAge();
		System.out.println(myPuppy.puppyAge);
	}
}

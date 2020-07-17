package reviw_java;

public class Test_array {
	public static void main(String[] args) {
    int size = 5;
    double[] grade = new double[size];
    grade[0] = 60;
    grade[1] = 80;
    grade[2] = 80;
    grade[3] = 69;
    grade[4] = 98;
    
    double total = 0;
    for(double x :grade) {
    	total += x;
    }
    System.out.print(total);
    System.out.print("\n");
    
    double max = grade[0];
    for(double x :grade) {
    	if(x>max) {
    		max = x;
    	}
    }
    System.out.print(max);
    
	}
}

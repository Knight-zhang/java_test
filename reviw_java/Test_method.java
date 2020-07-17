package reviw_java;

public class Test_method {
    public static void main(String[] args){
		double i = 5.0;
		int j = 2;
		double k = max(i, j);
		System.out.println("the max value is :"+k);
    	
	}
    
    
    public static int max(int number1,int number2) {
    	int result;
    	if(number1>=number2) {
    		result = number1;
    	}else {
			result = number2;
		}
    	return result;
    }
    
    //方法的重载，为了看到效果，实际上下面的方法取得是最小值
    public static double max(double number1, double number2) {
    	double result;
    	if(number1<=number2) {
    		result = number1;
    	}else {
			result = number2;
		}
    	return result;
    	}
}
 
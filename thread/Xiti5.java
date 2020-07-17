package thread;

public class Xiti5 {

 

	public static void main(String[] args) {

 

		long sum = 0;

		long ans = 0;

		for(int i = 1; i <= 10; i ++) {

			ans = ans*10 + 8;

			sum += ans;

		}

		System.out.println(sum);

	}

}

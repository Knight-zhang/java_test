package thread;
//�ֱ���do-while��forѭ������1+1/2��+1/3��+1/4��+����ǰ20��͡�

public class Xiti3{

	public static void main(String[] args) {

		double sum = 0.0;

		for(int i = 1; i <= 20; i ++) {

			int f = 1;

			for(int j = 1; j <= i; j ++) {

				f *= j;

			}

			sum += 1.0/f;

		}

		System.out.println(sum);

	}

}

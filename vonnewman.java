import java.util.Scanner;

public class vonnewman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			long t = s.nextLong();
			long rem;
			long q = t;
			long sum = 0;
			long a = 0;
			while (q != 0) {
				rem = q % 10;
				q = q / 10;

				long m = (long) Math.pow(2, a);
				sum = sum + (rem * m);
				a++;

			}

			System.out.println(sum);
			

		}
	}

}

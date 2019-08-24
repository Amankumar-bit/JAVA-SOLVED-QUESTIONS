import java.util.Scanner;

public class sequence1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int b = 0;
		int l = 0;
		int m = 0;
		// int p=0;
		int u = 0;

		for (int i = 0; i < n; i++) {

			int t = s.nextInt();

			if (i == 0) {
				b = t;
			} else {
				if (b > t && u == 0) {
					b = t;
					l++;       //this is for decreasing ....

				}

				else if (b < t) // increasing
				{

					b = t;
					m++;

					u++;

				} else {
					break;
				}

			}

		}
		// decreasing condition

		int h = l + m + 1;
		if (h == n) {
			System.out.println("true");

		} else {
			System.out.println("false");

		}

	}

}

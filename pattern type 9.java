package work2;

import java.util.Scanner;

public class ladder9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int k;
		int j;
		int u;
		for (int i = 2 * t + 1; i > 0; i--) {
			if (i > (2 * t) / 2) {
				for (int m = 0; m < 2 * t + 1 - i; m++) {
					System.out.print(" ");
					System.out.print("\t");
				}

				for (j = i - t - 1; j >= 0; j--) {

					System.out.print(j);
					System.out.print("\t");
				}
				for (int n = 1; n <= i - t - 1; n++) {
					System.out.print(n);
					System.out.print("\t");
				}

			} else {

				for (u = i; u > 1; u--) {
					System.out.print(" ");
					System.out.print("\t");
				}

				for (k = t - i + 1; k >= 0; k--) {
					System.out.print(k);
					System.out.print("\t");
				}

				for (int h = 1; h <= t - i + 1; h++) {
					System.out.print(h);
					System.out.print("\t");
				}

			}
			System.out.println();

		}

	}

}

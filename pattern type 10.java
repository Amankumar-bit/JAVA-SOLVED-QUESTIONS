package work2;

import java.util.Scanner;

public class ladder10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		int a = 2 * t + 1;

		for (int i = a; i > 0; i--) {

			if (i > a / 2) {

				for (int j = 0; j < a; j++) {
					if (j < a + 1 - i || j > i - 2) {

						if (j < a / 2 + 1) {
							System.out.print(t - j);
							System.out.print("\t");
						} else {
							System.out.print(j - t);
							System.out.print("\t");
						}
					} else {
						System.out.print(" ");
						System.out.print("\t");
					}
				}

				System.out.println();

			} else {
				int b = a - i + 1;
				for (int k = 0; k < a; k++) {
					if (k < a + 1 - b || k > b - 2) {
						if (k < a / 2 + 1) {
							System.out.print(t - k);
							System.out.print("\t");
						} else {
							System.out.print(k - t);
							System.out.print("\t");
						}
					} else {
						System.out.print(" ");
						System.out.print("\t");
					}
				}

				System.out.println();

			}
		}

	}

}

package work2;

import java.util.Scanner;

public class ladder11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int i = 0; i < t; i++) {

			if (i < t / 2 + 1) {
				for (int j = 1; j <= t + 2 * i; j++)// for no of coloumns
				{
					if (j < t - 2 * i) // for no of starting spaces
					{
						System.out.print(" ");
						System.out.print("\t");
					}

					else // if not spaces then printing values
					{
						if (j < t - i + 1 || j > t + i - 1) // values after and before the spaces
						{
							int u = j + i - 1;

							if (j < t - i + 1) {
								System.out.print(t - u);
								System.out.print("\t");
							} else {
								System.out.print(j - t - i + 1);
								System.out.print("\t");
							}

						} else // spaces between two values in the innermost of an arrow
						{
							System.out.print(" ");
							System.out.print("\t");
						}

					}

				}

				System.out.println(); // for next line.....
			}

			else {
				int b = t - i - 1;

				for (int k = 1; k <= t + 2 * b; k++) {
					if (k < t - 2 * b) {
						System.out.print(" ");
						System.out.print("\t");
					}

					else {
						if (k < t - b + 1 || k > t + b - 1) {
							int d = k + b - 1;

							if (k < t - b + 1) {
								System.out.print(t - d);
								System.out.print("\t");

							} else {
								System.out.print(k - t - b + 1);
								System.out.print("\t");
							}

						} else {
							System.out.print(" ");
							System.out.print("\t");
						}
					}

				}

				System.out.println();

			}

		}

	}

}

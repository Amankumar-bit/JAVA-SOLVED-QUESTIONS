package work2;

import java.util.Scanner;

public class ladder3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		int a=0;
		int b=1;
		
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print(a);
			a=a+b;
			int d=a;
			a=b;
			b=d;
			System.out.print("\t");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

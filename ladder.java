package work2;

import java.util.Scanner;

public class ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int u=0;
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=i;j++)
			{  u++;  
				System.out.print(u);
				System.out.print("\t");
			}                          
			
			System.out.println();
		}
		
		
		
		
		
		

	}

}

package work2;

import java.util.Scanner;

public class ladder7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		int j;
		for(int i=1;i<=t;i++)
		{
			for(j=1;j<=i;j++)
			{
				
					System.out.print(j);
					System.out.print("\t");
			}
			for(int k=1;k<=2*t-2*i-1;k++)
			{
				System.out.print(" ");
				System.out.print("\t");
			}
			for(int l=i;l>=1;l--)
			{
	             if (l<t)			
					{
	            	 System.out.print(l);
	            	 System.out.print("\t");
					}
	             else
	             {
	            	 l=i;
	             }
		     }
			
		System.out.println();
		}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	}

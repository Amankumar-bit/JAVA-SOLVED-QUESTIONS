package work2;

import java.util.Scanner;

public class ladder4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int k;
		int i;
		for( i=0;i<t;i++)
		{
			if(i<(t/2)+1)
			     {
				
		
			       for(int j=(t-2*i)/2;j>=1;j--)
			              {
				          System.out.print(" ");
				      	System.out.print("\t");
			              }
			       for(int l=0;l<2*i+1;l++ )
			              { 
				          System.out.print("*");
				         
				System.out.print("\t");
			              }
		
		             System.out.println(); 
		
			      }
			
			else
			     {
			         for(int d=0;d<=i-(t/2+1);d++)
			         {
			        	 System.out.print(" ");
			        		System.out.print("\t");
			         }
			         
			         for(int u=2*(t-i-1)+1;u>0;u--)
			         {
			        	 System.out.print("*");
			        	 System.out.print("\t");
			         }
			     System.out.println(); 
			     }
			
		}
		
		

	}

}

package work2;
import java.util.Scanner;

public class ladder5 {
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a=t/2+1;
		//int l;
		for(int i=0;i<t;i++) 
		{
			 if(i<t/2+1)
			 	{
			 			for(int j=0;j<t;j++)
			 				{
			 					if(j<a-i||j>=t-a+i)
			 					{
			 						System.out.print("*");
			 						System.out.print("\t");
			 					}
			 					else
			 					{
			 						System.out.print(" ");
			 						System.out.print("\t");
			 					}
			 				}
			 	
	         System.out.println();  
		
			 	}
			else
			{ int l=t-i-1;
				
				 		for(int j=0;j<t;j++)
				 		{
				 			if(j<a-l||j>=t-a+l)
				 			{
				 				System.out.print("*");
				 				System.out.print("\t");
				 			}
				 			else
				 			{
				 				System.out.print(" ");
				 				System.out.print("\t");
				 			}
					
				 		}
			         System.out.println();
				
				
			}
	}
}
}
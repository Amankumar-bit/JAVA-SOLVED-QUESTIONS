package work2;

import java.util.Scanner;

public class ladder7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int value;
		

		for(int i=1;i<=t;i++)
		{
			
			
			value=i;
		
		
				for(int k=1;k<=t-i;k++)
					{
						System.out.print(" ");
		System.out.print("\t");
					}
				for(int j=1;j<=i;j++)
					{  
					System.out.print(value);
					value++;
					System.out.print("\t");
					}
					value=value-2;
					if(i>1)
					{
						while(value>=i)
						{
							System.out.print(value);
							System.out.print("\t");
							value--;
						}
			
			
					}	
			
					System.out.println();
			}

	}

}

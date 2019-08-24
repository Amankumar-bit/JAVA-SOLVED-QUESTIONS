package work2;

import java.util.Scanner;

public class ladder6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int value;
		int t=2*n-1;
		for(int i=1;i<=t;i++)
		{
			if(i<=t/2+1)
			
			{
			value=i;
		
		
				for(int k=1;k<=n-i;k++)
					{
						System.out.print(" ");
					System.out.print("\t");
					}
				for(int j=1;j<=i;j++)
					{  System.out.print("\t");
					System.out.print(value);
					value++;
					
					}
					value=value-2;
					if(i>1)
					{
						while(value>=i)
						{	System.out.print("\t");
							System.out.print(value);
						
							value--;
						}
			
			
					}	
			
					System.out.println();
			}
					else
					{
						int b=t-i+1;
						
						value=b;
						
						
						for(int k=1;k<=n-b;k++)
							{System.out.print("\t");
								System.out.print(" ");
							}
						for(int j=1;j<=b;j++)
							{  System.out.print("\t");
							System.out.print(value);
							value++;
							//System.out.print("\t");
							}
							value=value-2;
							if(b>1)
							{
								while(value>=b)
								{System.out.print("\t");
									System.out.print(value);
								//	System.out.print("\t");
									value--;
								}
					
					
							}	
					
							System.out.println();				
						
						
						
						
						
						
						
				
						
						
					}
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		

	}

}

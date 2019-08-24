package work2;
import java.util.Scanner;

public class ladder2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int u=1;
		
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=i;j++)
			{  	
				if(j==1||j==i)
					{
					System.out.print(u);
					}
				else 
				{
					System.out.print("0");
				}
				System.out.print("\t");
			}   
			
			u++;
		 
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int even=0;
		int odd=0;
		
		
		for(int i=0;i<n;i++)
		{
			int m = s.nextInt();
			
			
			while(m!=0)
			{int rem=m%10;
					if(rem%2==0)
					{
				even=even+rem;
					}
					else
					{
						odd=odd+rem;
					}
			m=m/10;
			}
		
			if(even%4==0||odd%3==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			
			even=0;
			odd=0;
			
		}
		
		
	

	}

}

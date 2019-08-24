import java.util.Scanner;

public class repcing5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
 long m=t; 
 long num=0;
		int  i=0;
		int d=0;
		while(t!=0)
		{
			i++;
			t=t/10;
		}
		
		if(m>0)
		{
			while(m>0)
			{
				long rem=m%10;
				if(rem==0)
					{
					rem=5;
					}
				m=m/10;
			
				long c=(long)Math.pow(10,d);
			
				num=num+(rem*c);1
				d++;
			
			}
		
	System.out.println(num);
		}
		else
		{
			System.out.println(5);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
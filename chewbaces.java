import java.util.Scanner;

public class chewbaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

			Scanner s = new Scanner(System.in);
			long a = s.nextLong();
			long n=a;
			long c=0;
			long b=0;
			long sum=0;
		while(n!=0)
		{
			c++;
			n=n/10;
			
			
		}
		
		long i=0;
		while(i<c)
			{
				long rem=a%10;
	       a=a/10;
				long in=9-rem;
	
	
				if(i==c-1&&rem==9)	
				{
					rem=9;	
				}
				else
				{
					if(rem<in)
		
					{
						rem=rem+0;
		
					}
					else
					{
						rem=in;
					}
				}
      long  p=(long)Math.pow(10, b);
			sum=sum+(p*rem);
					b++;
					i++;		
		}
		System.out.println(sum);
		
		
	}

}




	

	import java.util.Scanner;

	public class binarytodecimal {  

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			
			int rem;
			int q=t;
			int sum=0;
			int a=0;
	        while(q!=0)
	        { rem=q%10;
	        	q=q/10;
	        	
	        	int m=(int) Math.pow(2,a);
	        	sum=sum+(rem*m);
	        	a++;
	        	
	        	
	        }
			
			System.out.println(sum);

		
		
		
		
		
		
		
		
		
		}

	}

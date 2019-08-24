import java.util.Scanner;
public class printseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N1 = s.nextInt();
		int N2 = s.nextInt();
	int c=1;
	int l=0;
	while(l<N1)
	{
		int a=(3*c+2);
		if(a%N2!=0)
		{
			System.out.println(a);
		l++;
		}
		
		
		c++;
	}
	
	
	
	
	}

}

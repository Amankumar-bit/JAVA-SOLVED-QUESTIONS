	import java.util.Scanner;	
public class decimaltooctal {


	static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
	int q=t;
		int power;
		int i=0;
		int sum=0;
		while(q!=0)
		{
		int rem =q%8;
			q=q/8;
		
			 power=(int)Math.pow(10,i);
		sum=sum+(rem*power);
            i++;		
		}
		System.out.println(sum);
	
		
		
		
		
	}

}

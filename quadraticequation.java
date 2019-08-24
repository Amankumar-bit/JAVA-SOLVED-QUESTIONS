import java.util.Scanner;

public class quadraticequation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d=(int)Math.sqrt((b*b)-(4*a*c));
		int root1;
		int root2;
		if(d>0)
		{
			System.out.println("Real and Distinct");
		root1=(-b+d)/(2*a);
		root2=(-b-d)/(2*a);
			System.out.println(root1+" "+root2);
		}
		else if(d==0)
		{
			System.out.println("Real and Equal");
			root1=(-b)/(2*a);
			root2=(-b)/(2*a);
				System.out.println(root1+" "+root2);
		}
		else
		{
			System.out.println("Imaginary");
			
		}
 }
}
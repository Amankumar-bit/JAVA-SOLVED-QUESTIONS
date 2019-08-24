import java.util.Scanner;

public class lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s = new Scanner(System.in);
		char a = s.next().charAt(0);
		//System.out.println(a);
		if (a>=65&&a<=90)
		{
			System.out.println("UPPERCASE");
		}
		else if(a>=97&&a<=122)
		{
			System.out.println("lowercase");
		}
		else
		{
			System.out.println("INVALID");
		}	
	}

}

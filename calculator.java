import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
int h;
int b;
		do
		{	
			Scanner s = new Scanner(System.in);
		char a = s.next().charAt(0);
		 if(a==(char)88||a==(char)120)
		{
			break;
		}
		 else if(a==(char)43)
			
			{
			 h = s.nextInt();
			 b = s.nextInt();
			System.out.println(h+b);
			
			}
			else if(a==(char)45)
			{
			 h = s.nextInt();
			 b = s.nextInt();
			System.out.println(h-b);
			
			}
			else if(a==(char)42)
			{
			 h = s.nextInt();
			 b = s.nextInt();
			System.out.println(h*b);
			
			}
			else if(a==(char)47)
			{
			 h= s.nextInt();
			b = s.nextInt();
			System.out.println(h/b);
	
			}
			else if(a==(char)37)
			{
			 h = s.nextInt();
			 b = s.nextInt();
			System.out.println(h%b);
			
			}
			
			else
			{
			System.out.println("Invalid operation. Try again.");
			continue;
			}	
	}	while(true);

	}
	
	


}
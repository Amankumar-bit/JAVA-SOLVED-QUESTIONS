package work1;

import java.util.Scanner;
public class shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;  
        int u=0;
		int h=0;
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int l=1;l<=T;l++)
		 {
		 int M = s.nextInt();
		 int N = s.nextInt();
		 if(M>N)
		 {
			 a=M;
		 }
		 else
		 {
			 a=N;
		 }
		u=0;
		h=0;
		 for(int i=0;i<a;i++)
		{
		u=u+(2*i)+1;
		h=h+(2*i)+2;
		//System.out.println("u="+u);
		//System.out.println("h="+h);
		if((u<=M)&&(h<=N))
			{
			continue;
		
			}
		else if(u>M&&h<=N)
		{
			System.out.println("Harshit");
			break;
		}
		
		else if(u>M&&h>N)
		{
			if(M>N)
			{
				System.out.println("Aayush");	
				break;
			}
			else
			{
				System.out.println("Harshit");
				break;
			}
		}
		else 
		{
			System.out.println("Aayush");
			break;
		}
		
	
		
	}
	
	
		 }	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

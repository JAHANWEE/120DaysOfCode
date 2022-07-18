import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t= scn.nextInt();
		
		while(t>0){
		    t--;
		    
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int c = scn.nextInt();
		    int d = scn.nextInt();
		    
		    
		   if(a+b < c+d){
		       System.out.println(a+b);
		   }else{
		       System.out.println(c+d);
		   }
		}
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		while(t>0){
		    t--;
		    
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int c = scn.nextInt();
		    
		    if(a<=3){
		        System.out.println(a*b);
		    }else{
		        int z = a/3;
		        if(a%3==0){
		            int ans = (a*b)+(z-1)*c;
		            System.out.println(ans);
		        }else{
		         int ans =(a*b)+ (z*c);
		        System.out.println(ans);
		        }
		        }
		    }
		}
}

/* package codechef; // don't place package name! */

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
		    int n = scn.nextInt();
		    String s = scn.next();
		    int i=0;
		    int f = 1;
		    while(i+3 < n){
		        if(charactercheck(s.charAt(i),s.charAt(i+1),s.charAt(i+2),s.charAt(i+3) ) == true ){
		            System.out.println("No");
		            f=0;
		            break;
		        }
		        i++;
		    }
		    if(f==1){
		        System.out.println("Yes");
		    }
		t--;    
		}
	}
	
	static boolean charactercheck(char a, char b, char c, char d){
	    if(concatcon(a) && concatcon(b) && concatcon(c) && concatcon(d)){
	        return true;
	    }else {
	        return false;
	    }
	}
	
	static boolean concatcon(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            return false;
        else
            return true;
	}
}
            
            
		



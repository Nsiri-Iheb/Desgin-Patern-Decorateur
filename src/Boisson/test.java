package Boisson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

public class test {
	public static void main(String[] args)  {
		

		
		 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
         while (t-- > 0) {
             long n = sc.nextLong();
             boolean found = false;
             for (int i = 1; i <= Math.sqrt(n); i++) {
                 if (n % i == 0) {
                     long y = n / i;
                     if (y > i && (i * y + i + y) == n) {
                         System.out.println(i + " " + y);
                         found = true;
                         break;
                     }
                 }
             }
             if (!found) {
                 System.out.println(-1);
             }
         }
     }

	
	    
		
		       
		     
		    
		}





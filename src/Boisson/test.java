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
		        String codeforces = "codeforces";
		        while (t-- > 0) {
		            char c = sc.next().charAt(0);
		            if (codeforces.indexOf(c) >= 0) {
		                System.out.println("YES");
		            } else {
		                System.out.println("NO");
		            }
		        }
		        sc.close();
		    }
		

	
	    
		
		       
		     
		    
		}





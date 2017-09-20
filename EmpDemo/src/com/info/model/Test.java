package com.info.model;


import java.util.Scanner;

public class Test 
{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		 int n = scan.nextInt();
	    int count = 0;
	    
	    try {
			if(n<=0)
			{
				System.out.println(count);
			}
			else
			{
			
			
			for (int i = 0; i <= n; i++) {
			    int j = i;
			    System.out.print(" i = "+i);
			    while (j > 0) {
			        if (j % 10 == 2)
			            count++;
			        j /= 10;
			        
			        System.out.print(" j = "+j);
			        System.out.print(" count = "+count);
			    }
			    System.out.println();
			}
			System.out.println(count);
   
}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }

	
 } 
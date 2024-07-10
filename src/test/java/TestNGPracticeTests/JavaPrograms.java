package TestNGPracticeTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[10];
		
		System.out.println("Enter Array integer values:");
		Scanner sc = new Scanner(System.in);
		
		
//		pyramid();
//		fibanoicce();
//		prime();
		for(int k =0; k<10;k++) {
			
		    a[k] = sc.nextInt(); 
		
			
			
		}
		removeDuplicates(a);
//		maxDiff(a);
		
//		asce(a);

//		int sum = sumOfArray(a);
//		System.out.println(sum);
		
		

	}

//	public static int sumOfArray(int[] a) {
//		// TODO Auto-generated method stub
//		
//		int sum =0;
//		
//		for (int j=0; j< a.length;j++)
//		{
//			sum = sum + a[j];
//		}
//		
//		return sum;
//	}
	
//	
//	public static int maxDiff(int a[]) {
//		
//		int maxDiff=0;
//		
//		int diff[] = new int[a.length-1];
//		
//		for(int i=0;i<a.length-1;i++) {
//			
//			diff[i] = Math.abs(a[i]-a[i+1]);
//			System.out.println(diff[i]);
//			
//		 maxDiff = Arrays.stream(diff).max().getAsInt();
//			
//			
//			
//			
//		}
//		
//		System.out.println("Difference="+ maxDiff );
//		
//		return maxDiff;
//		
//		
//	}
	
	
	
	public static void  asce(int a[]) {
		
		int temp =0;
		for (int i=0; i< a.length-1;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					temp = a[i];
					a[i]= a[j];
					a[j] = temp;
					
				}
				
				
				
				
			}
			
		
			
		}
		for(int k =0; k< a.length;k++) {
			System.out.println(a[k]);
		}
		
		
	}
	
	
	public static void pyramid() {
		
		
		int p = 5;
		
		for(int i=0;i<p;i++) {
			
			for(int j = 0; j<=i;j++) {
				
				System.out.print("* ");
				
			}
			System.out.print("\n");
		}
	}
	
	
	public static void fibanoicce() {
		
		
		int x = 10;
		
		int a=0;
		int b=1;
		int sum =0;
		System.out.println(a+","+b+",");
		for(int i =2; i< x; i++) {
			
			sum = a+b;
			System.out.println(sum+",");
			a = b;
			b= sum;
			
			
			
			
			
		}
	}
	
	
	
	public static int prime() {
		
		int  num = 69;
		int c= 0;
		
		if (num <=1) {
			System.out.println (num+" is not a prime number");
			return 0;
		}
		else {
			for(int j =2; j<= num; j++) {
				
				if(num % j ==0) {
					c++;
					
				}
				
				
			}
		}
		
		if(c>1) {
			
			System.out.println(num +" is not a prime number");
			
		}
		else {
			System.out.println(num +" is  a prime number");
			
		}
		
		return 0;
	}
	
	
	
	public static void removeDuplicates(int[] a) {
		
		
		
		int temp =0;
		for (int i=0; i< a.length-1;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					temp = a[i];
					a[i]= a[j];
					a[j] = temp;
					
				}
				
				
				
				
			}
			
		
			
		}
		for(int k =0; k< a.length;k++) {
			System.out.println(a[k]);
		}
		
		
		
		
		
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		
		for(int n =0; n<a.length;n++) {
			int z=0;
			
			if(!x.contains(a[n])) {
				
				x.add(a[n]);
				
				for(int c =n; c<a.length;c++) {
					if(a[c]== a[n]) {
						z++;
					}
				}
				System.out.println(a[n]+"->"+ z);
				
				
			}
			
			
			
			
			
		}
		
		
		
		for(int m : x) {
			System.out.print(m+",");
		}
		
	}
	

}

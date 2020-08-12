package com.osa.test;
public class Mentoring {
public static void main(String[] args) {
	


	
    int[] a= {8,15,13,20,30,25,40,35,50,55,65,60};	
	int sum=0;
	
      for(int i=0; i<a.length; i++) {
		
		if(a[i]>sum) {
			sum=a[i];
			
		}
		System.out.println(sum);
	}
	System.out.println(sum);
}
}
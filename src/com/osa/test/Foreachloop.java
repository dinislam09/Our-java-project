package com.osa.test;

public class Foreachloop {
public static void main (String[]args) {
		
		String name[]=new String[4];
			name[0]="Islam";
			name[1]="Md";
			name[2]="alamin";
			name[3]="sydul";
			for(String s:name) {
				System.out.println(s);
			}
		int b[]= {3,5,8,6,12};
		for(int p:b) {
			System.out.println(p);
		}
		
		double c[]= {1.5,2.5,3.6,4.0};
		for(double m:c) {
			System.out.println(m);
		}
		
	}



}

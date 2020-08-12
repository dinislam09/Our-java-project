package com.osa.test;

import java.io.File;
import java.util.Scanner;

public class StringObaid {
public static void main(String[] args)  {
	readtex("C:\\Users\\shihab\\Desktop\\Java\\String.text");
	}
 		public static void readtex(String path) {
		try {
		Scanner sc = new Scanner(new File(path));
		String a;
		while((a=sc.nextLine()) !=null) {
			String a1 []=a.split(",");
			System.out.println(("\n")+"Fast name : "+a1[0]);
			System.out.println("Last name : "+a1[1]);
			System.out.println("Email Id : "+a1[2]);
			System.out.println("Phone no : "+a1[3]);
			}
		}catch(Exception r) {
	
		}
	}
	}
	


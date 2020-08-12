package com.osa.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StringObaidrun {
public static void main(String[] args) {
	StringObaidrun st = new StringObaidrun();
		st.readmytex("C:\\Users\\shihab\\Desktop\\Java\\String.text");
}
		public void readmytex(String path) {
		try {
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		String st;
		while((st=br.readLine())!=null) {
			String s[]=st.split(",");
			System.out.println(("\n")+"Fast Name : "+s[0]);
			System.out.println("Last Name : "+s[1]);
			System.out.println("Email Id : "+s[2]);
			System.out.println("Phone Number : "+s[3]);
		}
		} catch(Exception e) {
			}
		}	
}

package com.osa.test;

public class Constracto {

	String name, gender;
	int age;
	
	
	Constracto() {
		int a =8;
		int b =10;
		int c=a+b;
		System.out.println(c);
	}
	
	Constracto(String d, int c,String e ) {
		name = d;
		gender=e;
		age = c;
	System.out.println("Name : "+d+ "Gender : "+e+ "Age : "+c);
		
	}
	
	Constracto (String a,String b, int c){
		name =a;
		gender=b;
		age =c;
		System.out.println("Name : "+a+"Gender : "+b+"Age : "+c);
	}
	
	
	
		
}

package com.osa.test;

public class StringDemo {
public static void main(String[] args) {
	
	//String s = "My Name Is Din";
	//String s = "My Name Is mDinm";
//	int length = s.length();
	
	//int indexofm = s.indexOf('m');
	//int ind1 = s.indexOf('m', indexofm+1);
	//int ind2 = s.indexOf('m', ind1+1);
//	System.out.println(ind2);
	
	
	
	String name = "Md din Islam";
	String name1="";
	String[] s4=name.split(" ");
	for(int i=s4.length-1; i>=0; i--) {
		name1=name1.concat(s4[i]).concat(" ");
		
	}
	System.out.println(name1);
}

}


public class StringDetails {
	String s = "my name is shamim";
	String s4="but I am not ....";
	
	//@Test
	public void stringDetails() {
	String d[] = s.split(" ");
	
	for (int i=0; i<d.length-1; i++) {
		System.out.println(d[i]);
		
	}
	
	int v = d.length-1;
	
	System.out.println(v);
	
	String k2 = "10";
	
	int a = Integer.parseInt(k2);
	System.out.println(a);
	
	String k3 = k2+10;
	
	int k4 = a + 10;
	
	System.out.println(k4);

	String s1 = "My name is khan";
	String s3 = new String("my name is khan");
	
	
	char c = s.charAt(5);
	int	n = s.compareTo("my name is khan");
	int m = s.compareTo(s1);
	int l = s.compareToIgnoreCase(s1);
	int j = s.compareTo(s3);
	String j1 = s.concat(" but I am not a ......");
	
	boolean b = s.contains("name");
	boolean b1 = s.endsWith("khan");
	boolean b2 = s.equals(s1);
	boolean b3 = s.equals(s3);
	int b4 = s.hashCode();
	int b5 = s.indexOf('m');//first occurrence
	int b6 = s.indexOf("my");
	int b7 = s.indexOf('m', b5+1);//second occurrence
	int b12 = s.indexOf('m', b7+1);//third occurrence
	s.indexOf("is", 1);
	String[] b8 = s1.split(" ");
	String b9 = b8[3];
	
	String[] b10 = s.split("my");
	String b11 = b10[0];

	//int b7 = s.in		
	System.out.println(b9);
	
	System.out.println(b11);
	
	System.out.println(b7);
	
	System.out.println(b6);
	
	System.out.println("j is = "+j);

	System.out.println("j1 is = "+j1);
	
	System.out.println("b is = "+b);
	
	int x=100;
	int y=200;
	String p="Hello";
	String q="World";

	System.out.println(x+y+p+q);//300HelloWorld
	System.out.println(p+q+x+y);//HelloWorld100200
	System.out.println(p+q+(x+y));//HelloWorld300
	
	String [] name = new String [4];
	
	name[0] = "Shamim";
	name[1] = "Amin";
	name[2] = "Hasan";
	name[3] = "Mitul";
	
	for (int i=0; i<4; i++ ) {
		System.out.println(name[i]);
	}
	
	System.out.println();
//or 	
	
	String [] names = {"Shamim","Amin","Hasan","Mitul"}; 
	
	//we fix the condition and looping until condition met
	for (int i=0; i<4; i++ ) {
		System.out.println(names[i]);
	}

	// For each loop or enhance loop
	// Looping based on the length of the string
	System.out.println();
	for (String name1: names ) {
		System.out.println(name1);
	}
	
	System.out.println();
	
	
	System.out.println("abc".compareTo("abcd"));
	
}
	
	//@Test
	public void xp() {
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(5));
	
	}
		
	StringBuffer s2 = new StringBuffer("how are you");
	String s1 = "how are you";
	
	
	//@Test
	public void booleanWithString() {
		
		boolean con = s.contains("you");
		System.out.println("con is :" + con);
		
		boolean equal = s.contentEquals("how are ");
		System.out.println("equal is :" + equal);
		
		boolean equal1 = s.contentEquals("how are you");
		System.out.println("equal1 is :" + equal1);
		
		
		boolean equal2 = s.equals(s2);
		System.out.println("equal2 is :" + equal2);
		
		boolean b = s.isEmpty();
		System.out.println("It is empty :"+b);
		
		
		String addString = s + s4;
		System.out.println("String plus :"+addString);
		

		String conString = s.concat(s4);
		System.out.println("String concat :"+conString);
		
		
		String upperCase = conString.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
	}
	
	//@Test
	public void playWithStringMethods () {
		String s3 = s1.concat(" doing?");
		System.out.println(s1);
		System.out.println(s3);
		
		
		StringBuffer s4 = s2.append(" doing");
		System.out.println(s4);
		
	}
	
	
	


}





package com.osa.test;

public class Calculator {
public static void main(String[] args) {

	Calculator r = new Calculator();
	           r.add();
	           r.sub();
	           r.add1();
}

	void add() {
	int x=5;
	int y=6;
	int z= x+y;
	System.out.println("the value of" + z); 
	
	
	
}
void sub() {
	int m=5;
	int n=4;
	int p=m+n;
	
	System.out.println(p);
	
}

void add1() {
    int p=30;
    int q =5;
    int t=p/q;
    
    
    System.out.println(t);
	
	
	
}






}



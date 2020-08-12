package com.osa.test;

public class Perametar {

	//int x=20;
	
	//void add(int a, int b, String r) {
		
		//System.out.println(r+(a+b));  // the value of sum: if you put fix(syso(the value of sum: +(a+b)
	//}
	
	//void sub() {
		
		
		
		
		int a=10;
		int b=20;
		int c=a+b;
		//System.out.println(c);
	//}
	
	
	void add1(String name, String city, int age) {
		
		
		System.out.println("my name is " +name+ "  I am from "+city+" and " + age +" yers old.");
	}
	
	void tax( int sales) {
		double tax= sales*.10;
		
		System.out.println("My total tax : tk"+tax);
	}
	void rent(int salary) {
		
		
		double rent=salary*.60;
		double bill=rent*.10;
		double con=bill*.50;
		System.out.println("my rent: "+rent + " my utility bill : "+bill + " My con bill : "+con);
	}
	
	void annualIncome(int annualincome, int person) {
		
		int totalgross=annualincome-person*2;
		double taxpay=totalgross*.15;
		
		System.out.println("Total pay : "+ taxpay +" Tolal Gross : "+ totalgross);
		
		
	} 
	
	
	void payDue(int income, int housesize) { 
		
		int gross=income-housesize*10000;
		double totaltax=gross*.15;
		double paytax=gross*.10;
		double duepay=totaltax-paytax;
		
		System.out.println("Total Gross : "+gross+" Total Tax : "+totaltax+" Pay/Due : "+duepay);
		
		
		
		
	}
	
	void refund(int income,int housesize,double paytax) {
		int taxincome=income-(10000*housesize);
		double totaltax=taxincome*.15;
		double refund=paytax-totaltax;						// h/w Q4.(Note- total gross-(familly size*100000) then total tax 15% then refund (paytax-totaltax)
		System.out.println("Refund :"+refund);
		
	}
	
}

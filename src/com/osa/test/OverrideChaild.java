package com.osa.test;

public class OverrideChaild extends OverridePreand{
public static void main(String[] args) {
	OverrideChaild a=new OverrideChaild();
			a.add();
	
}
	
	
	@Override
	void add() {
		String x="Year";
		int age=40;
		System.out.println(x+age+a);
		
	}

}

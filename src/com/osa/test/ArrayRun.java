package com.osa.test;



public class ArrayRun {
public static void main(String[]argrs) {
	
	//int[] a= {1,20,15,29,25};
	//int lenth=a.lenght;
	//System.out.println();
	//for (int i=0; i<a.length; i++) {
	//System.out.println(a[i]);
	//}
	
	//int []num= {10,20,25,35,41,50,60}; 
	//Arrays.parallelSort(num);
	//System.out.println("Totall value" +num[num.length-1]);
	//int max = num[0];
	//for (int i =1; i<num.length; i++) {
		
	//	if (num[i]>max) {                    // less number if(num[i]<max)=10 
	//		max=num[i];
			
			
			
	//	}
	//	}
	//System.out.println(max);
	
	//int []b= {10,3,4,7,65,70,69,90};   // Specific number print.=====
	//for(int i=0;i<b.length;i++) {
		
	//if (b[i]==70) {
	//	System.out.println(b[i]);
	//}
	//}
	
	//String[] a1= {"Sydul","Shuvo","Al-Amin","Din"}; // Specific name print.
	//for(int i=0;i<a1.length;i++) {
		
		//if (a1[i].equals("Shuvo")) {
		//	System.out.println(a1[i]);
	//	}
		//}
	
	
	//String [] n= {"Md","din","Islam"};
	
	//String a="md";
//	for (int i =0; i<n.length; i++) 
	//	a.charAt(i);
			
	//System.out.println(a);
	

	int []num= {10,20,25,6,12,35,2,41,50,60}; 
	int acc=num[0];
	for (int i =0; i<num.length; i++) {
	    if(num[i]>acc) 
	    	acc=num[i];
			
			
	
	}
	
	System.out.println(acc);
	
}
}

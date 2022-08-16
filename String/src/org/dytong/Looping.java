package org.dytong;



public class Looping {
public static void main(String[] args) {
	int[] a=new int [5];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	System.out.println(a);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println("for each");
	for(int x:a) {
		System.out.println(x);
	}
}
}

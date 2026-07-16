package org.acc.c2tc.java;

public class Variabledemo {
	int price=10;
	void print() {
		String msg ="Hello";
		System.out.println(msg);
	}
	static String message="Hello World";
	public static void main(String[] args) {
		Variabledemo obj =new Variabledemo();
		System.out.println(obj.price);
		obj.print();
		System.out.println(message);
	}

}

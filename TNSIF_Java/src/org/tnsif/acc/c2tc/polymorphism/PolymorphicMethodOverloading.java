package org.tnsif.acc.c2tc.polymorphism;
class addition{
	int add(int n1,int n2){
		return n1+n2;
	}
	int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
}

public class PolymorphicMethodOverloading {

	public static void main(String[] args) { 
		addition add =new addition();
		System.out.println(add.add(2, 2));
		System.out.println(add.add(1,1,2));
		

	}

}

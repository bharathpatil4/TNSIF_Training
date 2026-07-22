package org.tnsif.acc.c2tc.datatypes_typecasting;

public class TypeCastingDemo {

	public static void main(String[] args) { 
		double pricePerItem=99.50;
		int quantity=3;
		double totalPrice=quantity*pricePerItem;
		
		double discount=10.75;
		int roundDiscount=(int)discount;
		
		double finalAmount=totalPrice-roundDiscount;
		
		System.out.println("online Shopping Summary");
		System.out.println("items Bought"+quantity);
		System.out.println("Price per item :" +pricePerItem);
		System.out.println("Final Amount to pay afetr discount :"+finalAmount);

	}

}

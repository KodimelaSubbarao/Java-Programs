package com.sa.assignment9;

import java.util.function.Consumer;

public class Tester implements Consumer<ShoppingCart>
{
	 public double applyDiscount(double totalPrice) {
	    if (totalPrice > 1000000) {
	         return totalPrice * 0.9; // Apply 10% discount
	    }
	    return totalPrice;
	 }
	public void accept(ShoppingCart sc) 
	{
		CartItem ci=sc.getItems();
		double tp=ci.getTotalPrice();
		double discount=applyDiscount(tp);
		System.out.println("Original Price: " + tp);
	    System.out.println("Discounted Price: " + discount);
	    System.out.println("Discount Applied: " + (tp - discount));
	}
	
	
	public static void main(String[] args) {
		new Tester().accept(new ShoppingCart(new CartItem("Oppo", 1999.99, 10)));
		
	}
}

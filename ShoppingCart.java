package com.sa.assignment9;

public class ShoppingCart 
{
	private CartItem items;
	
	public ShoppingCart(CartItem ci) {
		this.items=ci;
	}

	public CartItem getItems() {
		return items;
	}

	public void setItems(CartItem items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}
	
}

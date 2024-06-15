package com.sa.assignment9;

import java.util.function.Consumer;

public class Task1 
{
	public static void main(String[] args) {
		float prices[] = {10469.32f,18765.34f,39784.32f,323424.34f,833536.737f};
		
		Consumer<Float> c=(dis)->{
			float totalPrice=0.0f;
			
			for(float f:prices)
			{
				totalPrice +=f;
			}
			float discount=0.0f;
			if(totalPrice>1000000) {
				 discount=totalPrice*10/100;
				 System.out.println(totalPrice-discount);
			}
			else
				System.out.println(totalPrice);
		};
		c.accept((float) 10);
	}
}

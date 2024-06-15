package com.sa.numbers;

public class PowerNumber {

	public static void main(String[] args) {
		int base=10,expo=3;
		int power=1;
		for(int i=expo;i>0;i--)
		{
			power*=base;
		}
		System.out.println(power);
		System.out.println((int)Math.pow(base, expo));
	}

}

package com.sa.assignment9;

import java.util.function.Function;

public class FahrenheitToCelsiusConversion 
{

	public double apply(double  celsius)
	{
		return celsius*273.15;
	}
	public static void main(String[] args) {
		
		Function<Double, Double> ftoc=f -> (f - 32)*5/9;
		
		System.out.println(ftoc.apply((double) 77));
		
		System.out.println((new FahrenheitToCelsiusConversion().apply((double)38)));
	}
}

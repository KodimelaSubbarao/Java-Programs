package com.sa.assignment9;

import java.util.function.Predicate;

public class CarSearch 
{
	public static void main(String[] args) {
		Car car1=new Car("Maruthi", 25000, 65);
		Predicate<Car> p=car->	car.getPrice()>=10000 && car.getPrice()<=30000 &&car.getMileage()<50000;
		if(p.test(car1))
			System.out.println(car1);
		else
			System.out.println("Your car is not for sale");
		
	}
}

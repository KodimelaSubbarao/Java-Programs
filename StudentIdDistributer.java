package com.sa.assignment9;

import java.util.function.Supplier;

public class StudentIdDistributer implements Supplier<String>
{
	 private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	 private static final int ID_LENGTH = 8;
	 
	 @Override
	 public String get() {
	        StringBuilder idBuilder = new StringBuilder();
	        for (int i = 0; i < ID_LENGTH; i++) {
	            int index = (int) (Math.random() * CHARACTERS.length());
	            idBuilder.append(CHARACTERS.charAt(index));
	        }
	        return idBuilder.toString();
	    }
	public static void main(String[] args) {
		Student std1=new Student("Subbarao", new StudentIdDistributer().get(), 'A');
		System.out.println(std1);
	}
}

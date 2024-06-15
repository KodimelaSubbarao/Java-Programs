package com.sa.tasks;

interface NIT1 
{
	String nit(String courseName);
}
interface Course1 extends NIT1
{
	String courseName();
	String facultyName();
	String duration();
}
public class A
{
	public static void main(String[] args) {
		NIT1 nit = (String course) -> course;
		System.out.println(nit.nit("Java"));
	}
}


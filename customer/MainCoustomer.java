package com.java.customer;

public class MainCoustomer 
{
	public static void main(String[] args) 
	{
		Customer C = new Customer();
			 C.setName("Lance");
			 C.setEmail_id("lance123@gmail.com");
			 C.setPhone(7894561230l);
			 C.setSalary(199.0);
		     
	        System.out.println("Customer Details Using 'JAVA BEANS'");
	        System.out.println("-------------------------------------");
	        System.out.println("Name : "+C.getName());
	        System.out.println("Email Id : "+C.getEmail_id());
	        System.out.println("Phone No : "+C.getPhone());
	        System.out.println("Salary : "+C.getSalary());
	}
}

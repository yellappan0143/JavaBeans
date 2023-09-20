package com.java.employee;

public class MainEmployee 
{

	public static void main(String[] args) 
	{
		Employee E = new Employee();
		         E.setName("Madesh");
		         E.setEmail_id("madesh@gamil.com");
		         E.setPhone(788944562l);
		         E.setCompany("Wipro");
		         E.setSalary(5999.0);
		         E.setExprence(2);
		         E.setPassword("mass123");
		         System.out.println("Employee Details Using 'JAVA BEANS'");
		         System.out.println("-------------------------------------");
		         System.out.println("Name : "+E.getName());
		         System.out.println("Email Id : "+E.getEmail_id());
		         System.out.println("Company : "+E.getCompany());
		         System.out.println("Salary : "+E.getSalary());
		         System.out.println("Mobile No : "+E.getPhone());
		         System.out.println("Experence : "+E.getExprence()+" - years");
		         System.out.println("Password : "+E.getPassword());

	}

}

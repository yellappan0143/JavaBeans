package com.java.customer;

public class Customer 
{
     // DATA MEMBER PROVIDING SECURITY BY USING JAVA BENAS
     private String Name;
     private String Email_id;
     private double Salary;
     private long   Phone;
    
     public String getName()
     {
    	 return Name;
     }
     public String getEmail_id()
     {
    	 return Email_id;
     }
     public double getSalary()
     {
    	 return Salary;
     }
     public long getPhone()
     {
    	 return Phone;
     }
     
     public void setName(String U_Name) 
     {
		this.Name=U_Name;
     }
     public void setEmail_id(String U_Emailid) 
     {
    	 this.Email_id=U_Emailid;
     }
     public void setSalary(double U_Salary) 
     {
    	 this.Salary=U_Salary;
     }
     public void setPhone(long U_Phone) 
     {
    	 this.Phone=U_Phone;
     }	
}

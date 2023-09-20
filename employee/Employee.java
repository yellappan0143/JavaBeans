package com.java.employee;

import java.io.Serializable;

public class Employee  implements Serializable
{
	/* DATA MEMBER SHOULD BE IN PRIVATE BY USING JAVA BEANS */
     private String Name;
     private String Email_id;
     private String Company;
     private double Salary;
     private long   Phone;
     private int    Exprence;
     private String Password;
     
 /* GETTER METHOD MEAN READ THE DATA WITH THE HELP OF JAVA BEAN */
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
     public String getCompany()
     {
    	 return Company;
     }
     public long getPhone()
     {
    	 return Phone;
     }
     public int getExprence()
     {
    	 return Exprence;
     }
     public String getPassword()
     {
    	 return Password;
     }
     
 /* SETTER METHOD MEAN WRITE OR UPDATE THE DATA WITH THE HELP OF JAVA BEAN */
     
     public void setName(String U_Name) 
     {
		this.Name=U_Name;
	 }
     public void setEmail_id(String U_Email) 
     {
    	 this.Email_id=U_Email;
     }
     public void setCompany(String U_Company) 
     {
    	 this.Company=U_Company;
     }
     public void setSalary(double U_Salary) 
     {
    	 this.Salary=U_Salary;
     }
     public void setPhone(long U_Phone) 
     {
    	 this.Phone=U_Phone;
     }
     public void setExprence(int U_Exprence) 
     {
    	 this.Exprence=U_Exprence;
     }
     public void setPassword(String U_Password )
     {
    	 this.Password=U_Password;
     }
       
}

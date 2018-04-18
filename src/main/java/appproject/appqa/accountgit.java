package appproject.appqa;

import java.util.HashMap;
import java.util.Map;

public class accountgit {

	private String firstName;
	private String lastName;
	private int accountNumber;
	private static int accountnumberExclusive = 0;
	
	public accountgit(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		accountgit.accountnumberExclusive++;
	}
	
	public String getFirstName() {
		return firstName;
	}	
	
	public void setFirstName(String firstName) { 		
	this.firstName = firstName; 
	} 


 	public String getLastName() { 
	return lastName; 
 	} 

 
	public void setLastName(String lastName) { 
		this.lastName = lastName; 
	} 

 
	public int getAccountNumber() { 
	return accountNumber; 
	} 


	public void setAccountNumber(int accountNumber) { 
	this.accountNumber = accountNumber; 
	} 

}



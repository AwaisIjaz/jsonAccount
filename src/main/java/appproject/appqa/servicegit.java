 package appproject.appqa; 
 import java.util.HashMap; 
 import java.util.Map; 

public class servicegit { 
	
private Map<Integer, accountgit> accountDatabase; 
	 
public servicegit() { 
		super(); 
		this.accountDatabase = new HashMap<Integer, accountgit>(); 
	} 
	 
	public void addAccount (accountgit account) { 
		this.accountDatabase.put(account.getAccountNumber(), account); 
	} 
	 
	public accountgit retrieveAccount (int accountNumber) { 
		return this.accountDatabase.get(accountNumber); 
	} 
 
public Map<Integer, accountgit> getAccounts() { 
	return accountDatabase; 
	} 

public static void main(String[] args) {
	System.out.println();
	}
} 

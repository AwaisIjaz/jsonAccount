 package appproject.appqa; 
 import java.util.HashMap; 
 import java.util.Map;
 import com.fasterxml.jackson.core.JsonProcessingException;
 import com.fasterxml.jackson.databind.ObjectMapper;

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
	
	public String mapToJSON() { 
		ObjectMapper jsonMaker = new ObjectMapper(); 
try { 
	return jsonMaker.writeValueAsString(accountDatabase); 
	} 

	catch (JsonProcessingException e) { 
		e.printStackTrace(); 
		return "Error"; 
	} 
}
}
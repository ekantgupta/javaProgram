package com.test.hm;

public class Account {
	
	private int accountNumber;
	private String accountType;
	private String accountHolderName;
	
	public Account(int accountNumber, String accountType, String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public int hashCode() {
		
		int temp = 14;
		int result = 1;
		int code = temp * result + accountNumber;
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj == null || this.getClass() != obj.getClass())
			return false;
		
		if(this == obj)
			return true;
		
		Account account = (Account) obj;
		
		return this.accountNumber == account.accountNumber;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", accountHolderName="
				+ accountHolderName + "]";
	}
	
	

}

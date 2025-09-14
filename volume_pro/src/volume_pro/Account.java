package volume_pro;

import java.math.BigDecimal;

public class Account {

	private String accountNumber;
	private String accountBook;
	private BigDecimal trxAmt;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountBook() {
		return accountBook;
	}
	public void setAccountBook(String accountBook) {
		this.accountBook = accountBook;
	}
	public BigDecimal getTrxAmt() {
		return trxAmt;
	}
	public void setTrxAmt(BigDecimal trxAmt) {
		this.trxAmt = trxAmt;
	}

}

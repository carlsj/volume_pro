package volume_pro;

import java.math.BigDecimal;

public class CalcInterest {
	
	private String caStDt;
	private String caLtDt;
	private Integer days;
	private BigDecimal balAmt;
	private BigDecimal intRate;
	public String getCaStDt() {
		return caStDt;
	}
	public void setCaStDt(String caStDt) {
		this.caStDt = caStDt;
	}
	public String getCaLtDt() {
		return caLtDt;
	}
	public void setCaLtDt(String caLtDt) {
		this.caLtDt = caLtDt;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	public BigDecimal getBalAmt() {
		return balAmt;
	}
	public void setBalAmt(BigDecimal balAmt) {
		this.balAmt = balAmt;
	}
	public BigDecimal getIntRate() {
		return intRate;
	}
	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}
	
	

}

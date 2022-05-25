package com.indiabix.framework1;

public abstract class BankAcc 
{
	private int accNo;
	private String accNm;
	private float accBal;
	public BankAcc(int accNo, String accNm, float accBal) {
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	abstract public void withdraw(float accBal);
	public void items(float accBal)
	{
		System.out.println(accBal);
	}
	public int getAccNo() {
		return accNo;
	}
	/*public void setAccNo(int accNo) {
		this.accNo = accNo;
	}*/
	public String getAccNm() {
		return accNm;
	}
	/*public void setAccNm(String accNm) {
		this.accNm = accNm;
	}*/
	public float getAccBal() {
		return accBal;
	}
	/*public void setAccBal(float accBal) {
		this.accBal = accBal;
	}*/
	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
	}
	
	
	
}
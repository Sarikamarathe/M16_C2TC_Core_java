package com.indiabix.client1;

import com.indiabix.application1.MMBankFactory;
import com.indiabix.application1.MMCurrentAcc;
import com.indiabix.application1.MMSavingAcc;
import com.indiabix.framework1.BankFactory;
import com.indiabix.framework1.CurrentAcc;
import com.indiabix.framework1.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory f=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(18140223,"Sarika Marathe",10000,true);
		CurrentAcc n= new MMCurrentAcc(18241522,"Komal savant",4000,5000);
		System.out.println("Saving Account");
		s.withdraw(s.getAccBal());
		System.out.println("Current Account");
		n.bookProduct(n.getAccBal());
		
		System.out.println(s);
		System.out.println(n);
	}

}

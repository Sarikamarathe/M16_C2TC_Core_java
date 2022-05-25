package com.indiabix.client;

import com.indiabix.application.GSNormalAcc;
import com.indiabix.application.GSPrimeAcc;
import com.indiabix.application.GSShopFactory;
import com.indiabix.framework.NormalAcc;
import com.indiabix.framework.PrimeAcc;
import com.indiabix.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(181,"Sarika Marathe",500,true);
		NormalAcc n= new GSNormalAcc(182,"Komal Savant",500,10);
		System.out.println("Prime account");
		p.bookProduct(p.getCharges());
		System.out.println("Normal account");
		n.bookProduct(p.getCharges());
		//System.out.println(s.getNewPrimeAcc(1, "Jayeshri", 1000, true));
		//System.out.println(s.getNewNormalAcc(2, "Payal", 2000, 50));
		
		System.out.println(p);
		System.out.println(n);

	}

}

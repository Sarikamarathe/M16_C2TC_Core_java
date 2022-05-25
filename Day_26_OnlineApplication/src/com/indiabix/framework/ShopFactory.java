package com.indiabix.framework;

public abstract class ShopFactory
{
	abstract public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean deliverycharges);
	abstract public  NormalAcc getNewNormalAcc(int accNo, String accNm, float charges,float deliveryCharges);

}

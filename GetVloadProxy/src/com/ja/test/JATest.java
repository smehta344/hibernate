package com.ja.test;

import java.lang.reflect.Proxy;

import com.ja.benas.TransferService;
import com.ja.helper.IDBIFundTrans;
import com.ja.helper.NeftFundTransService;

public class JATest {

	public static void main(String[] args) {
		TransferService transferFund;
		TransferService proxy = null;
		transferFund = new IDBIFundTrans();

		// transferFund=new SBIFundTrans();
		System.out.println("Sbi: " + transferFund);
		String fund = transferFund.fundTransfreService("112233", "223344", 350.0f);
		System.out.println("Data: " + fund);
		proxy = (TransferService) Proxy.newProxyInstance(IDBIFundTrans.class.getClassLoader(),
				new Class[] { TransferService.class }, new NeftFundTransService(proxy));
		System.out.println(proxy.getClass());
	}
}

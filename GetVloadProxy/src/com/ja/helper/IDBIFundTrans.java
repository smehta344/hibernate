package com.ja.helper;

import java.util.UUID;

import com.ja.benas.TransferService;

public class IDBIFundTrans implements TransferService {

	@Override
	public String neftFundTransfer(String fromAcc, String toAcc, float amount) {
		System.out.println("IDBIFundTrans.neftFundTransfer()");
		return UUID.randomUUID().toString();
	}

	@Override
	public String fundTransfreService(String fromAcc, String toAcc, float amount) {
		System.out.println("IDBIFundTrans.fundTransfreService()");
		return UUID.randomUUID().toString();
	}

}

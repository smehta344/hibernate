package com.msf.test;

import com.msf.accesor.PassengerDao;
import com.msf.entites.Passenger;
import com.msf.helper.SessionFactoryHelper;

public class MSFTest {
	public static void main(String[] args) {
		PassengerDao dao = null;
		Passenger passenger = null;
		try {
			dao = new PassengerDao();
			passenger = new Passenger();
			passenger.setPassengerNo(2);
			passenger.setPassengerFirstName("Sandipa");
			passenger.setPassengerLastName("Kumari");
			passenger.setAge(22);
			passenger.setGender("Female");
			passenger.setMobileNo("+9185653786");
			passenger.setEmailAddress("sanjip@gmail.com");
			dao.savePassenger(passenger);
			dao.getPassenger(2);
			System.out.println("PASSENGER STORED SUCCESSFULLY: " + passenger);
		} finally {
			SessionFactoryHelper.close();
		}

	}
}

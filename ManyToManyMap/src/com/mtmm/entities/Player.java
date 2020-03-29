package com.mtmm.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Player implements Serializable {
	protected int playerNo;
	protected String playerName;
	protected String gender;
	protected int age;
	protected String mobileNo;
	protected String emailAddress;

	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Player [playerNo=" + playerNo + ", playerName=" + playerName + ", gender=" + gender + ", age=" + age
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + "]";
	}
}

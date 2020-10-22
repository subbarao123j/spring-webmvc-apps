package com.spring;

public class LoginModel {

	public boolean isValid(String user, String pass) {
		
		System.out.println("From Login Model");

		if (user.equals(pass)) {

			return true;

		}

		return false;

	}

}

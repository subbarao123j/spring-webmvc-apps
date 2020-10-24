package com.spring;

public class LoginModel {

	public boolean isValid(String usr, String pwd) {
		
		

		if (usr.equals(pwd)) {

			return true;

		}

		return false;

	}

}

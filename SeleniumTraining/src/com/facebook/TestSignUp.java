package com.facebook;

public class TestSignUp {

	public static void main(String[] args) {
		
         SignUpFlow objSignUpFlow = new SignUpFlow();
         objSignUpFlow.initializeWebEnvironment();
         objSignUpFlow.verifyHeaderOfFacebookSignUpPage();
         objSignUpFlow.signUp();
	}

}

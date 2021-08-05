package com.facebook;


	

	import java.util.Hashtable;
	import java.util.Random;

	public class Utility {
		Random objRandom = new Random();

		public Hashtable<String, String> objHashTable;

		public Utility() {
			objHashTable = new Hashtable<String, String>();
		}

		public String getRandomString(int lenght) {
			String chars = "abcdefghiklmnopqrstuvwxyz";
			String randomstring = "";
			for (int i = 0; i < lenght; i++) {
				int rnum = (int) Math.floor(Math.random() * chars.length());
				randomstring += chars.substring(rnum, rnum + 1);
			}
			return randomstring;
		}

		public String setMobileNumber1() {
			String mobNo = " ";

			for (int i = 0; i < 6; i++) {
				mobNo = mobNo + objRandom.nextInt(9);
			}
			return mobNo;
		}
		
		public int getRandomDate(int intMaxNumberLength) {
			int intNumber = (int) ((Math.random()) * intMaxNumberLength);
			if (intNumber == 0) {
				intNumber = (int) ((Math.random()) * intMaxNumberLength);
			}

			return intNumber;
		}
		public int randomBirthMonth(){
			
			int intRandomMonth = objRandom.nextInt(13);
			return intRandomMonth;
			
			
		}
		
		public int getYear() {
			int strYearTemp = 0;
			int strYear = 0;
			for (int intIndex = 0; intIndex < 100; intIndex++) {
				strYearTemp = objRandom.nextInt(2021);
				if (strYearTemp > 1922) {
					strYear = strYearTemp;
					break;
				}
			}
			return strYear;

		}

		public Hashtable<String, String> createSignUpTestData() {

			objHashTable.put("Name", "Amol");
			objHashTable.put("LastName", "Patil");
			objHashTable.put("MobileNo", "9881");
			objHashTable.put("Password", "Amol@");
			objHashTable.put("BirthDate", "");
			objHashTable.put("Month", "");
			objHashTable.put("Year", "");
			objHashTable.put("Gender", "Male");
			objHashTable.put("SignUp Button", "Sign In");
			objHashTable.put("Logout Text Visible", "Logout");
			return objHashTable;
		}

	}




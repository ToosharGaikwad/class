package com.casestudy.coin;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("for add 1 coin ");
		
		coinManagementDao dao = new coinManagementDao();
		
		 	int cid = dao.addCoin(); // get next ID

			System.out.print("Enter country: ");
	        String country = sc.nextLine();

	        System.out.print("Enter denomination: ");
	        int denomination = sc.nextInt();

	        System.out.print("Enter year of minting: ");
	        double year = sc.nextDouble();

	        System.out.print("Enter current value: ");
	        double value = sc.nextDouble();
	        Coin coin = new Coin(cid, country, denomination, year, value, null);

	        // Insert into DB
	        dao.addCoin();

	        // Display all coins
	        dao.toString();
	}

}

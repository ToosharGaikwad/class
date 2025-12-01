package com.casestudy.coin;

import java.time.LocalDate;
import java.util.Date;

public class Coin {
	
		int coinid;
		String country;
		int denomination;
		double yearOfMinting;
		double currentvalue;
		 private LocalDate aquireDate;
		
		
		public Coin() {
			super();
		}
		
		
		public Coin(int coinid, String country, int denomination, double yearOfMinting, double currentvalue,
				LocalDate tdate) {
			super();
			this.coinid = coinid;
			this.country = country;
			this.denomination = denomination;
			this.yearOfMinting = yearOfMinting;
			this.currentvalue = currentvalue;
			this.aquireDate =   tdate;
		}
		public int getCoinid() {
			return coinid;
		}
		public void setCoinid(int coinid) {
			this.coinid = coinid;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getDenomination() {
			return denomination;
		}
		public void setDenomination(int denomination) {
			this.denomination = denomination;
		}
		public double getYearOfMinting() {
			return yearOfMinting;
		}
		public void setYearOfMinting(double yearOfMinting) {
			this.yearOfMinting = yearOfMinting;
		}
		public double getCurrentvalue() {
			return currentvalue;
		}
		public void setCurrentvalue(double currentvalue) {
			this.currentvalue = currentvalue;
		}
		public LocalDate getAquireDate() {
			return aquireDate;
		}
		public void setAquireDate(LocalDate  aquireDate) {
			this.aquireDate = aquireDate;
		}
		
		public String toString() {
		    return "Coin { " +
		            "id=" + coinid +
		            ", country='" + country + '\'' +
		            ", denomination=" + denomination +
		            ", yearOfMinting=" + yearOfMinting +
		            ", currentValue=" + currentvalue +
		            ", acquireDate=" + aquireDate +
		            " }";
		}
		
		
		
		
	

}

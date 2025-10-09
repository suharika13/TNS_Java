package main;

import application.GSNormalAcc;
import application.GSPrimeAcc;

public class MainFactory {

	public static void main(String[] args) {
		GSPrimeAcc gsprime = new GSPrimeAcc(101,"Nikhitha",4000,true);
		GSNormalAcc gsnormal = new GSNormalAcc(102,"Thanvi",3500,36.3f);

		gsprime.bookProduct(10.4f);
		gsnormal.bookProduct(22.3f);
		
	}

}
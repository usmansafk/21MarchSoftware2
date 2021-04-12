package com.qa.Exception;

public class HSBC {

	public void SalarySlip(int sal, int absences) {
		float tax = sal * 20 / 100;
		try {
			if (absences > 10) {
				AbsentException ref = new AbsentException();
				throw ref;
			}
		} catch (AbsentException t) {
			System.out.println("There has been too many absences");
		}

		System.out.println("Tax Amount is: " + tax);

	}

}

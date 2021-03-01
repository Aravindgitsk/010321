package org.bank.override;

public class AxisBank extends BankInfo {
	public void saving() {
		System.out.println("2%");

	}
	public void deposit() {
		System.out.println("12%");

	}
	public static void main(String[] args) {
		AxisBank ab= new AxisBank();
		ab.deposit();
		ab.saving();
		ab.fixed();
		
	}
}

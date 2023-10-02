package com.denomination.currencycount;

public class CurrencyDenomination {
	public void CurrencyDenominationCalc(int cur[], int amt) {
		int[] curCounter = new int[cur.length];
		try {
			for(int i = 0; i < cur.length; i++) {
				if(amt >= cur[i]) {
					curCounter[i] = amt/cur[i];
					amt = amt - curCounter[i] * cur[i];
					
					if(amt == 0) {
						break;
					}
				}
			}
			if(amt > 0)
				System.out.println("Exact Amount cannot be given with the highest denomination");
			else {
				System.out.println("Your payment approach n order to give min no fo notes will be");
				for(int i = 0; i< cur.length;i++) {
					if(curCounter[i] != 0) {
						System.out.println(cur[i] + ":" + curCounter[i]);
					}
				}
			}
		}catch(ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
		
	}
}

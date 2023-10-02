package com.denomination.driver;
import java.util.Scanner;
import com.denomination.currencycount.CurrencyDenomination;
import com.denomination.mergesort.MSImplementation;

public class DenominationDriver {

	public static void main(String[] args) {
		
		MSImplementation msImplementation = new MSImplementation();//mergeSortImplementation
		CurrencyDenomination currencyCount = new CurrencyDenomination();
		
		System.out.println("Enter the size of currency denomination");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] currency = new int[size];
		System.out.println("Enter the currency denominations value");
		for(int i = 0; i< size; i++) {
			currency[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amt = sc.nextInt();
		msImplementation.sort(currency,0,currency.length - 1);
		currencyCount.CurrencyDenominationCalc(currency, amt);
		sc.close();
	}

}

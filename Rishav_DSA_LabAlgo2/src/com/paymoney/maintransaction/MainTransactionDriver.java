package com.paymoney.maintransaction;
import java.util.Scanner;
import com.paymoney.services.TransactionServices;

public class MainTransactionDriver {

	public static void main(String[] args) {
		
		TransactionServices transactServices = new TransactionServices();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction Array");
		int size = sc.nextInt();
		int tArr[] = new int[size];
		
		System.out.println("Enter the values of array");
		for(int i = 0; i<size; i++)
			tArr[i] = sc.nextInt();
		
		System.out.println("Enter the total number of targets that needs to be achieved");
			int targetCount = sc.nextInt();
			
		transactServices.checkTarget(tArr, targetCount);
		sc.close();
	}
}

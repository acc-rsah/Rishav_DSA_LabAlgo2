package com.paymoney.services;

import java.util.Scanner;

public class TransactionServices {
	public void checkTarget(int[] tArr, int targetCount) {
		Scanner sc = new Scanner(System.in);
		
		while(targetCount-- != 0) {
			int flag = 0;
			int target;
			
			System.out.println("Enter the value of the target");
			target = sc.nextInt();
			
			int sum = 0;
			
			for(int i = 0; i< tArr.length; i++) {
				sum += tArr[i];
				if(sum >= target) {
					System.out.println("Target is achieved after "+(i+1)+ " transaction(s)\n\n");
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				System.out.println("Given target is not achieved!!\n");
			}
		}
		sc.close();
	}
}

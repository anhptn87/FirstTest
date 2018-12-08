package com.viettel;

import java.util.Random;

public class CountRandom {
	public static void main(String[] args) {
		 int data[] = new int[10];
		 Random r = new Random();
		for(int i = 0; i<10; i++) {
			data[i] = r.nextInt();
			System.out.println(data[i]);
		}
		int countOdd = 0;
		int countEven = 0;
		for (int j = 0; j<10;j++) {
			if(data[j]%2==0)
				countOdd++;
			else countEven ++;
		}
		
		System.out.println(countEven);
		System.out.println(countOdd);
	}

}

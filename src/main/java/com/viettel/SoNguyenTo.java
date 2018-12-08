package com.viettel;

public class SoNguyenTo {

	public static void main(String[] args) {
		
		SoNguyenTo snt = new SoNguyenTo();
		
		long check = 5;
		System.out.println(check + " is Prime Number = " + snt.isPrimeNumber(check));
		
		long biggest = 100;
		System.out.print("Prime numbers which are smaller than " + biggest + ": ");
		snt.printOutPrimeNumberSmallerThan(biggest);
		System.out.println("\nCount Odd & Even numbers which are smaller than " + biggest);
		snt.countOddEventPrimeNumber(biggest);

	}
	public boolean isPrimeNumber (long x) {
		if (x==1) 
			return false;
		for (int i =2; i <= x/2; i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
	public void printOutPrimeNumberSmallerThan (long biggestNumber) {
		for(int x=2;x<=biggestNumber;x++)
			if(isPrimeNumber(x))
				System.out.print(x + " ");
	}
	public void countOddEventPrimeNumber (long BiggetNumber) {
		int countOdd = 0;
		int countEven = 0;
		for(int i = 2; i < BiggetNumber/2;i++) {
			if(isPrimeNumber(i) & i%2==0)
				countOdd ++;
			if(isPrimeNumber(i) & i%2!=0)
				countEven ++;

		}
		System.out.println("\tCountOdd: " +countOdd);
		System.out.println("\tCountEven: " +countEven);
	}
}

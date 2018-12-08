package com.viettel;

public class ThamChieu {
	int val;
	public ThamChieu (int a) {
		val = a;
	}
	public void setVal (int x) {
		this.val =x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		ThamChieu a = new ThamChieu(5);
		ThamChieu b = new ThamChieu(9);
		b = a;
		b.setVal(10);
		System.out.println(a.val);
		System.out.println(b.val);
*/
		String s1 = "String 1";
		String s2 = "String a";
//		s2 = s1;
//		s2="new";
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.substring(0, 4));
	}

}

package com.viettel;

public class HoVaTen {

	String getName(String fullname) {
		if (fullname!=null) {
			String [] part = fullname.split(" ");
			if (part.length>0)
				return part[part.length-1];
			else return null;
		}
		else
			return null;
	}
	String getSurname(String fullname) {
		if(fullname!=null) {
			String [] part = fullname.split(" ");
			if(part.length>0)
				return part[0];
			else return null;
		}
		return null;
	}

	boolean isSomeName (String expect, String fullname) {
		String name = this.getName(fullname);
		if (name!=null & name.equalsIgnoreCase(expect))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Vu  Thi  Huyen  Trang";
		HoVaTen t = new HoVaTen();
		System.out.println(t.getName(input));
		System.out.println(t.getSurname(input));
		String expect = "trang";
		System.out.println("Is " + expect + "?\n" + t.isSomeName(expect, input));
		
	}

}

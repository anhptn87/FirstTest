package com.viettel;

public class TestWebElement {
	String value;
	String css;
	
	TestWebElement(String val, String css){
		this.value = val;
		this.css = css;
	}
	public TestWebElement() {
	}
	
	void input(String val) {
		this.value = val;
	}
	void addCss (String css) {
		this.css = css;
	}
	void doAction () {
		System.out.println(this.value);
		System.out.println(this.css);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestWebElement x = new TestWebElement();
		x.input("x val");
		x.addCss("x css");
		x.doAction();

	}

}

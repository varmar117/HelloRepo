package com.prv;

public class HelloWorld {

	public void sayHello(String str) {
		System.out.println("Hello :"+str);
	}
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.sayHello("Ravi");
		
	}
}

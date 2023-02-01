package com.flipkart.inheritance;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA = new A();
		objA.funcA();
		
		B objB = new B();
		objB.funcA();
		objB.funcB();
		
		C objC = new C();
		objC.funcA();
		objC.funcB();
		objC.funcC();
		
		D objD = new D();
		objD.funcA();
		objD.funcD();
	}

}

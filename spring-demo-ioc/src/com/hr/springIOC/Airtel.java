package com.hr.springIOC;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.print("I am calling using my Airtel sim");

	}

	@Override
	public void data() {
		System.out.print("I am surfing internet using my Airtel sim");
	
	}

}

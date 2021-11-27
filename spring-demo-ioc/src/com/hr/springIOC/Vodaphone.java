package com.hr.springIOC;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.print("I am calling using my Vodaphone sim");

	}

	@Override
	public void data() {
		System.out.print("I am surfing internet using my Vodphone sim");

	}

}

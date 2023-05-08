package com.moduledemo.IRepository;

public class HelloImpl implements IHello {

	@Override
	public String sayHelloToConsumer() {
		return "Hello consumer from impl...";
	}
	
	public String getPass() {
		return "Please accept pass...";
	}

}

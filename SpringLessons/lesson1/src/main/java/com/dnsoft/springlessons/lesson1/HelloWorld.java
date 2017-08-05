package com.dnsoft.springlessons.lesson1;

public class HelloWorld {
	private String name;
	 
    public HelloWorld() {
	    System.out.println("HelloWorld's constructor...");
	}
	 
	public void setName(String name) {
	    this.name = name;
	}
	 
	public void hello(){
	    System.out.println("Hello: " + name);
	}
	
	public String getHello(){
		return "Hello: " + name;
	}
	
}

package com.bhavesh.app;

public class Cat implements Animal{
	
	private String name;
	private String color;
	
	public Cat() {}
	
	public Cat(String name) {
		this.name = name;
	}
	
	public Cat(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void eat() {
		System.out.println("Milk");
	}
	
	public void makeNoise() {
		System.out.println("Miyaaun Miyaaun..!");
	}
	
	public void jump() {
		System.out.println("Jumping in house..!");
	}
	
}

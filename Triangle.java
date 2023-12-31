package com.sat.tmf.spring;

public class Triangle {
	private String type;
	private int height;
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(String type,int height) {
		this.type = type;
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println("Drawing "+getType()+" Triangle with height:"+getHeight());
	}
}

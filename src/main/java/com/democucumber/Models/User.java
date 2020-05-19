package com.democucumber.Models;

public class User {

	private String name;
	private float height;
	private int weight;
	
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(final float height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(final int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
}

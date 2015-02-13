package com.piro.bezier;

public class Vector2 {
	public float x;
	public float y;
	
	public void set(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

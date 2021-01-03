package com.basu.beans;

public class Triangle_Point {
	private Point a, b, c;

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
	
	public void draw() {
		System.out.println(" Triangle point a("+getA().getX()+","+getA().getY()+")");
		System.out.println(" Triangle point b("+getB().getX()+","+getB().getY()+")");
		System.out.println(" Triangle point c("+getC().getX()+","+getC().getY()+")");
	}
}

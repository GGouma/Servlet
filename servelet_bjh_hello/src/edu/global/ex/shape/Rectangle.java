package edu.global.ex.shape;


public class Rectangle  {
	private double width, height;


	public Rectangle(double wid,double hei) {
		width = wid;
		height = hei;
	}

	public void showPerimeter() {
		double peri = width * height;
		System.out.println("넓이: " + peri);
	}

	public double getArea() {
		double area = width * height;
		return area;
	}
}

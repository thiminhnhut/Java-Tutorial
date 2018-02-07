package minhnhut.desktop;

public class Triangle {
	private int a;
	private int b;
	private int c;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Triangle() {
		super();
	}
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", checkTriangle()=" + checkTriangle() + ", perimeter()="
				+ perimeter() + ", area()=" + area() + "]";
	}
	
	private boolean checkTriangle() {
		boolean check1 = this.a + this.b > this.c;
		boolean check2 = this.a + this.c > this.b;
		boolean check3 = this.b + this.c > this.a;
		boolean check4 = this.a > 0 && this.b > 0 && this.b > 0;
		return check1 && check2 && check3;
	}
	
	public int perimeter() {
		if (checkTriangle()) {
			return this.a + this.b + this.c;
		} else {
			return 0;
		}
	}
	
	public float area() {
		if (checkTriangle()) {
			float p = (float) (perimeter()*0.5);
			return (float) Math.sqrt(p*(p-this.a)*(p-this.b)*(p - this.c));
		} else {
			return 0;
		}
	}
	
}

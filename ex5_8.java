package java9_Weeks;

class Point1{
	private int x; 
	private int y;
	Point1(){
		x = 0;
		y = 0;
	}
	
	int move(int x, int y) {
		if (x < 0) {
			this.x = this.x;
			this.y = this.y;
		}
		
		else if (y < 0) {
			this.x = this.x;
			this.y = this.y;
		}
		
		else {
			this.x += x;
			this.y += y;
		}
		return x + y;
	}
	
	public String toString1() {
		return "(" + x + ", " + y + ") 의 점";
	}
}

class PositivePoint extends Point1{
	public PositivePoint() { 
		super.move(0, 0);
	}
	
	public PositivePoint(int a, int b) {
		super.move(a, b);
	}
}


public class ex5_8 { // class ex5_8 == class PositivePoint
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString1() + "입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString1() + "입니다.");
		
		PositivePoint p2 = new PositivePoint();
		p2.move(-10, -10);
		System.out.println(p2.toString1() + "입니다.");
		
	}
}

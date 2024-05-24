class Circle {
	int x, y, radius;

	Circle(int x, int y, int radius) { // Circle 객체에서 매개변수 3개를 받아서 x, y, radius에 각각 초기화 
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public boolean equals(Object obj) { // equals()메소드는 객체를 매개변수로 받음
		Circle C = (Circle) obj;
		if (x == C.x && y == C.y) // 본래있던 객체의 x,y 값과 매개변수로 받은 객체의 x,y 값 비교시 같으면 true, 아니라면 false
			return true;
		else
			return false;

	}

	public String toString() { // toString() 메소드 오버라이딩
		return "Circle(" + x + "," + y + ") 반지름" + radius;
	}
}

public class ex6_2 {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if (a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("다른 원");

	}
}

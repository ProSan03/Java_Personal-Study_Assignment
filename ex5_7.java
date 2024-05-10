package java10_Weeks;


class Point{
	private int x, y, z;
	Point(){ // 기본생성자
		x = 0;
		y = 0;
		z = 0;
	}
	Point(int a, int b, int c){ // 매개변수 3개 받는 생성자
		x = a;
		y = b;
		z = c;
	}
	int move(int a, int b) { // 매개변수 2개 받을 경우 x, y만 움직임
		x = a;
		y = b;
		return x + y;
	}
	int move(int a, int b, int c) { // 매개변수 3개 받을 경우 x, y, z가 한꺼번에 움직임
		x = a;
		y = b;
		z = c;
		return x + y + z;
	}
	int moveUp(){ // z를 +1 하는 함수
		z += 1;
		return z;
	}
	
	int moveDown() { // z를 -1 하는 함수
		z -= 1;
		return z;
	}
	public String toString() { // 출력 코드
		return "(" + x + "," + y + "," + z +")의 점";
	}
}


class Point3D extends Point{ // Point3d는 Point를 상속받음
	public Point3D(int a, int b, int c) {
		super(a, b, c); // super을 사용해 매개변수 3개 받는 생성자를 불러옴
	}
	
}



public class ex5_7 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3); // 포인트 3D 객체 p인데 매개변수 3개 받는 레퍼런스 생성
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString()+ "입니다.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString()+ "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString()+ "입니다.");
		
		
	}
}

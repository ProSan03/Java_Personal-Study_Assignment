package java9_Weeks;

class Point1{
	private int x; 
	private int y;
	Point1(){ // 기본 생성자 초기 좌표 x =0, y = 0 으로 초기화
		x = 0;
		y = 0;
	}
	
	int move(int x, int y) {
		if (x < 0) { // x 좌표가 음수 공간에 있는지 검사
			this.x = this.x;
			this.y = this.y;
		}
		
		else if (y < 0) { // y 좌표가 음수 공간에 있는지 검사
			this.x = this.x;
			this.y = this.y;
		}
		
		else { // x, y 두 좌표 모두가 양수 공간에 있을시 그 위치로 이동
			this.x = x;
			this.y = y;
		}
		return x + y;
	}
	
	public String toString1() {
		return "(" + x + ", " + y + ") 의 점";
	}
}

class PositivePoint extends Point1{ // PositivePoint는 Point1을 상속받음
	public PositivePoint() { 
		super(); // Point1의 기본생성자 실행
		super.move(0, 0);
	}
}


public class ex5_8 {
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint(); // 객체 p 생성
		p.move(10, 10);
		System.out.println(p.toString1() + "입니다.");
		
		p.move(-5, 5); // 음수공간으로 이동 불가
		System.out.println(p.toString1() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(); // 객체 p2 생성
		p2.move(-10, -10); // 음수공간으로 이동 불가이기 때문에 초기값인 0, 0 출력
		System.out.println(p2.toString1() + "입니다.");
		
	}
}

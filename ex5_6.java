package java9_Weeks;

class Point{
	private int x, y; 
	private String s; 
	
	public Point() { // 기본 Point 생성자
		setColor(); 
		setXY();
	}
	
	public Point(int a, int b) {  // 파라미터 2개 있는 Point 생성자
		setColor();
		setXY();
	}
	
	int setXY() { // 파라미터 없는 setXY 구현
		x = 0; // 기본적으로 x를 0으로 초기화
		y = 0; // 기본적으로 y를 0으로 초기화
		return x + y; // x, y 값 반환
	}
	
	int setXY(int x, int y){ // 파라미터로 int 값 2개를 받는 setXY 구현
		this.x = x; // x를 입력받은 파라미터 x값으로 초기화
		this.y = y; // y를 입력받은 파라미터 y값으로 초기화
		return this.x + this.y; // x, y 값 반환
	}
	
	void setColor() { // 파라미터 없는 setColor 구현
		s = "BLACK"; // 기본적으로 s를 BLACK으로 초기화
	}
	
	void setColor(String s) { // 파라미터로 문자열 1개를 받는 setColor 구현
		this.s = s; // s를 입력받은 파라미터 문자열 s 값으로 초기화
	}
	
	public String toString() { // string을 출력하는 함수
	    return s + "색의 " + "(" + x + "," + y + ")" + "의 점"; // toString가 반환해주는 것들
	}
	
	
}

class ColorPoint extends Point{ // ColorPoint는 Point를 상속 받음
	public ColorPoint() { // Point로부터 상속받은 생성자 실행
		setColor(); // Point setColor 실행
		setXY(); // Point setXY 실행
	}
	
	public ColorPoint(int a, int b) {  // Point로부터 상속받은 매개 변수 있는 생성자 실행
		setColor(); // Point setColor 실행
		setXY(); // Point setXY 실행
	}
}

public class ex5_6{
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5); // 파라미터로 int값 2개 넘겨주기
		cp.setColor("RED"); // 파라미터로 RED 넘겨주기
		System.out.println(cp.toString() + "입니다.");
	}
}

import java.util.*;

abstract class Shape{
	private Shape next;
	
	public Shape() {
		next = null;
	}
	
	public void setNext(Shape obj) { // 객체 레퍼런스를 받는다 즉, 링크 연결
		next = obj;
	}
	
	public Shape getNext() {
		return next;
	}
	
	public abstract void draw(); // 추상 메소드
	
}


abstract class Line extends Shape{
	public String tostring() { // 문자열 Line 반환
		return "Line";
	}

}

abstract class Rect extends Shape{
	public String tostring() { // 문자열 Rect 반환
		return "Rect";
	}
	
}

abstract class Circle extends Shape{
	public String tostring() { // 문자열 Circle 반환
		return "Circle";
	}
	
}
abstract class drawRun extends Shape {
	
	@Override
	public void draw() { // 추상 메소드 draw 구현
		for (int i = 0; i < 3; i++) {
			System.out.println("TT");
		}
	}
	}


public class ex5_12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		boolean t = true; // 유저가 4를 입력시 t는 false가 되면서 프로그램 종료
		
		while(t) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
			int userInput = sc.nextInt();
			switch(userInput) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3)>> ");
				break;
				
			case 2:
				System.out.print("삭제할 도형의 위치 >> ");
				int delete = sc.nextInt();
				if (delete == 1)
					// next[1] = " ";
					
				if (delete == 2)
					// next[2] = " ";
					
				if (delete == 3)
					// next[3] = " ";
				break;
				
			case 3:
				// draw(); //draw로 지금까지 그려진 도형들 전부 출력
				break;
				
			case 4:
				System.out.println("beauty를 종료합니다.");
				t = false;
				break;
				
			default: // 유저가 1~4까지가 아닌 다른 int값을 넣었을 경우
				System.out.println("1~4까지만을 입력해주시길 바랍니다.");
				break;
			}
		}
	}
}

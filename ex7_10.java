import java.util.*;

abstract class Shape {
	public abstract void draw(); // 추상 메소드
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class ex7_10 {
	public static void main(String[] args) {
		// 문자열 값만 다루는 제네릭 벡터 생성
		Vector<Shape> v = new Vector<Shape>(3);
		System.out.println("그래픽 에디터 beauty를 실행합니다. ");
		boolean T = true;
		Scanner sc = new Scanner(System.in);

		while (T) {
			System.out.println("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
			
			int userInput = sc.nextInt();
			switch (userInput) {
			case 1: // 삽입부 구현
				System.out.println("Line(1), Rect(2), Circle(3)>> ");
				int selectShape = sc.nextInt();
				switch (selectShape) {
				case 1:
					v.add(new Line());
					break;
				case 2:
					v.add(new Rect());
					break;
				case 3:
					v.add(new Circle());
					break;
				default:
					System.out.println("잘못된 입력입니다.");
				}
				break;

			case 2: // 삭제부 구현
				System.out.println("삭제할 도형의 위치>> ");
				int deletePoint = sc.nextInt();
				// 없는 위치에 접근할 경우 예외가 발생하므로, 예외 처리를 따로 해줘야함
				try {
				v.remove(deletePoint-1); // -1 해줘야 원하는 위치에 접근가능 (배열은 0부터 시작)
				}
				
				catch(ArrayIndexOutOfBoundsException e) { // 도형이 없는 위치에 접근할 경우 출력
					System.out.println("삭제할 위치에 도형이 없습니다.");
				}
				break;

			case 3: // 모두 보기
				for (int i = 0; i < v.size(); i++) {
					Shape p = v.get(i); // 벡터에서 i번째 String 값 얻어내기
					System.out.println(p); // 해당하는 i번째 String 값 출력
				}
				break;

			case 4: // 종료부 구현
				System.out.println("beauty를 종료합니다.");
				T = false;
				break;
			}
		}
	}
}

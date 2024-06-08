import java.util.*;

abstract class Shape {
	public abstract void draw(); // 추상 메소드
}

class Line extends Shape { // Line 구현
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape { // Rect 구현
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape { // Circle 구현
	public void draw() {
		System.out.println("Circle");
	}
}

public class ex7_10 {
	public static void main(String[] args) {
		// 객체 Shape 값만 다루는 제네릭 벡터 생성
		Vector<Shape> v = new Vector<Shape>(3); // 벡터 크기는 3으로 초기화
		System.out.println("그래픽 에디터 beauty를 실행합니다. ");
		boolean T = true;
		Scanner sc = new Scanner(System.in);

		while (T) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");

			int userInput = sc.nextInt();
			switch (userInput) {
			case 1: // 삽입부 구현
				System.out.print("Line(1), Rect(2), Circle(3)>> ");
				int selectShape = sc.nextInt();
				switch (selectShape) {
				case 1:
					v.add(new Line()); // 1을 누를시 Line 생성
					break;
				case 2:
					v.add(new Rect()); // 2를 누를시 Rect 생성
					break;
				case 3:
					v.add(new Circle()); // 3을 누를시 circle 생성
					break;
				default:
					System.out.println("잘못된 입력입니다.");
				}
				break;

			case 2: // 삭제부 구현
				System.out.print("삭제할 도형의 위치>> ");
				int deletePoint = sc.nextInt();
				if (deletePoint > 0 && deletePoint <= v.size()) { // 삭제하는 위치가 0보다 커야하고, 벡터의 총 크기 이하여야 "ArrayIndexOutOfBounds" 예외 피할 수 있음
					v.remove(deletePoint - 1); // -1 해줘야 원하는 위치에 접근가능 (배열은 0부터 시작)
				} else {
					System.out.println("삭제할 위치에 도형이 없습니다.");
				}
				break;

			case 3: // 모두 보기
				for (int i = 0; i < v.size(); i++) {
					Shape p = v.get(i); // 벡터에서 i번째 Shape 값 얻어내기
					p.draw(); // 해당 도형의 draw 메소드 호출
				}
				break;

			case 4: // 종료부 구현
				System.out.println("beauty를 종료합니다.");
				T = false;
				break;

			default:
				System.out.println("잘못된 입력입니다.");
			}
		}

		sc.close();
	}
}

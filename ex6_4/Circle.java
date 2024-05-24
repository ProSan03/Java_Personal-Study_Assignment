package derived;

import base.Shape; // 반드시 해줘야 Circle 클래스에서 base 패키지에 있는 Shape 클래스에 접근 가능

public class Circle extends Shape { // Circle 클래스는 Shape 클래스를 상속 받음
	public void draw() { // 3) draw() 메소드 오버라이딩 발생
		System.out.println("Circle"); // 5) 결과적으로 Circle에 있는 draw() 메소드 출력
	}
}

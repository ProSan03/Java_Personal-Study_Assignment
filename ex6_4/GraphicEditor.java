package app;

import base.Shape; // base패키지에 있는 Shape 클래스 참조
import derived.Circle; // derived패키지에 있는 Circle 클래스 참조

public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle(); // Shape 객체 생성
		shape.draw(); // 1) shape 객체의 draw() 메소드 호출
	}
	// 4) 따라서 최종 출력은 "Circle"이 됨.
}

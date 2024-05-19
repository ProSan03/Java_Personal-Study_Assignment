package package2;

interface Shape {
    final double PI = 3.14; // 상수
    void draw(); // 도형을 그리는 추상 메소드
    double getArea(); // 도형의 면적을 리턴하는 추상 메소드
    default public void redraw() { // 디폴트 메소드
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape {
    double radius; // 반지름

    public Circle(double radius) { // Circle 생성자
        this.radius = radius;
    }

    @Override
    public void draw() { // Circle에서의 draw 구현
        System.out.println("반지름이 " + radius + "인 원입니다.");
    }

    @Override
    public double getArea() { // 원에서 면적 = 반지름^2*PI
        return PI * radius * radius;
    }
}

class Oval implements Shape {
    int Ovalx; // 타원에서의 x축
    int Ovaly; // 타원에서의 y축

    public Oval(int Ovalx, int Ovaly) { // Oval 생성자
        this.Ovalx = Ovalx;
        this.Ovaly = Ovaly;
    }

    @Override
    public void draw() {
        System.out.println(Ovalx+ "x" + Ovaly + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() { // 타원 x축*타원 y축*PI = 타원의 면적
        return PI * Ovalx * Ovaly;
    }
}

class Rect implements Shape{
	int Rectx;
	int Recty;
	
	public Rect(int Rectx, int Recty) {
		this.Rectx = Rectx;
		this.Recty = Recty;
	}
	
	@Override
    public void draw() {
        System.out.println(Rectx+ "x" + Recty + "크기의 사각형 입니다.");
    }

    @Override
    public double getArea() { // x축 * y축 = 사각형 면적
        return Rectx * Recty;
    }
}

public class ex5_14 {
    public static void main(String[] args) {
    	Shape [] list = new Shape[3];
    	list[0] = new Circle(5); // 반지름이 10인 원 객체
        list[1] = new Oval(10, 30); // 20x30 사각형에 내접하는 타원
        list[2] = new Rect(20, 40); // 10x40 크기의 사각형
        
        for(int i =0; i <list.length; i++)
        	list[i].redraw();
        for (int i =0; i<list.length;i++)
        	System.out.println("면적은 " + list[i].getArea());
    }
}

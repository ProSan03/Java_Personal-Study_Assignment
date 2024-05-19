import java.util.*;

abstract class Shape {
    private Shape next;

    public Shape() {
        next = null;
    }

    public void setNext(Shape obj) { // 링크 연결을 해줌
        next = obj;
    }

    // next 필드를 반환하는 메소드
    public Shape getNext() {
        return next;
    }

    public abstract void draw(); // 추상 메소드이고, (Line, Rect, Circle)을 각각 구현해야함
}

class Line extends Shape { // Line 구현
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape { // Rect 구현
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape { // Shape 구현
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class ex5_12 {
    private Shape head; // Shape 리스트의 시작점
    private Shape tail; // Shape 리스트의 끝점 -> 이를 넘어서면 NULL이 됨

    public static void main(String[] args) {
        ex5_12 editor = new ex5_12(); // ex5_12 클래스의 인스턴스(레퍼런스) 생성
        editor.run(); // run 메소드 호출하여 프로그램 실행
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        boolean t = true; // 유저가 4를 입력하면 false가 되어 프로그램이 종료됨

        // 메인 루프: 사용자가 종료를 선택할 때까지 계속 실행
        while (t) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
            int userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                    Insert(); // 도형 삽입
                    break;
                case 2:
                    Delete(); // 도형 삭제
                    break;
                case 3:
                    showShapes(); // 모든 도형 보기
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

    void Insert() {
        System.out.print("Line(1), Rect(2), Circle(3)>> ");
        Scanner sc = new Scanner(System.in);
        int InsertSelect = sc.nextInt();
        Shape newShape;

        // 사용자가 선택한 도형을 생성
        switch (InsertSelect) {
            case 1:
                newShape = new Line();
                break;
            case 2:
                newShape = new Rect();
                break;
            case 3:
                newShape = new Circle();
                break;
            default:
                System.out.println("1~3까지만을 입력해주시길 바랍니다.");
                return;
        }

        // 링크드 리스트의 끝에 도형을 추가
        if (head == null) { // 리스트가 비어있으면
            head = newShape; // 새로운 도형이 head가 됨
        } else { // 리스트가 비어있지 않으면
            Shape temp = head;
            while (temp.getNext() != null) { // 리스트의 끝을 찾음
                temp = temp.getNext();
            }
            temp.setNext(newShape); // 리스트의 끝에 새로운 도형을 추가
        }
    }

    public void Delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 도형의 위치 >> ");
        int position = sc.nextInt();

        if (position <= 0) { // 음수가 올 수 없음
            System.out.println("잘못된 위치입니다.");
            return;
        }

        if (head == null) { // 삭제할 도형이 없으면 출력
            System.out.println("삭제할 도형이 없습니다.");
            return;
        }

        if (position == 1) { // 첫 번째 도형 삭제
            head = head.getNext();
            return;
        }

        Shape temp = head;
        for (int i = 1; i < position - 1; i++) { // 삭제할 도형의 직전 위치까지 이동
            if (temp.getNext() == null) { // 범위를 벗어난 경우
                System.out.println("잘못된 위치입니다.");
                return;
            }
            temp = temp.getNext();
        }

        if (temp.getNext() == null) { // 범위를 벗어난 경우
            System.out.println("잘못된 위치입니다.");
            return;
        }

        temp.setNext(temp.getNext().getNext()); // 도형 삭제 => 삭제할 도형의 직전 도형을 찾아 다음 도형을 건너뛰도록 연결해줘야함
    }

    public void showShapes() {
        Shape temp = head;

        // 리스트의 모든 도형을 출력
        while (temp != null) { // 리스트 끝까지
            temp.draw(); // 각 도형의 draw 메소드 호출
            temp = temp.getNext();
        }
    }
}

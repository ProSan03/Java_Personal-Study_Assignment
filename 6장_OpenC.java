import java.util.*;

// 키보드로부터 텍스트를 입력받아 하나의 문자열로 리턴하는 클래스
class Read {
	String readString() { // 키보드로부터 텍스트를 입력받아 하나의 문자열로 리턴하는 메소드임
		StringBuilder sb = new StringBuilder(); // 키 입력을 받을 스트링 버퍼 생성
		Scanner sc = new Scanner(System.in);

		while (true) { // ';'을 입력 받기 전까지 true로 둠
			String line = sc.nextLine(); // 사용자로부터 한 줄의 입력을 받음
			if (line.equals(";")) // 입력받은 줄이 ';'일 경우
				break; // 입력 종료
			sb.append(line); // StringBuilder에 입력받은 줄을 추가
		}
		return sb.toString(); // StringBuilder의 내용을 문자열로 반환
	}
}

public class OpenC {
	Read R = new Read(); // Read 클래스의 인스턴스를 생성

	void run() {
		System.out.println("영문 텍스트를 입력하고 세미콜론(;)을 입력하세요.");

		String inputString = R.readString(); // 입력 문자열을 읽어옴
		int[] frequency = new int[26]; // 알파벳 빈도를 저장할 배열 (a~z는 총 26개임)

		// 입력 문자열의 각 문자열들에 대해 반복
		for (int i = 0; i < inputString.length(); i++) { // 각 문자열의 길이 만큼 반복해줌
			char c = inputString.charAt(i); // 해당 문자열의 문자를 하나 가져옴

			if (c >= 'a' && c <= 'z') { // 들어온 문자가 알파벳 소문자일 경우
				frequency[c - 'a']++; 
				// 해당 알파벳의 빈도를 증가시킴 ('c'의 아스키 코드 값에서 - 'a'(56) 아스키 코드 값의 인덱스를 증가 시켜줌)
				// ex) c가 = 'a'라면, 'a' - 'a' 결과 값은 0이 되고, 0번째 위치에 해당하는 a부분의 빈도를 +1증가 시켜줌
			}

			else if (c >= 'A' && c <= 'Z') { // 들어온 문자가 알파벳 대문자일 경우
				frequency[c - 'A']++; 
			}
		}

		// 각 알파벳의 빈도를 '-'로 출력
		for (int i = 0; i < 26; i++) { // 알파벳 개수(26개)만큼 반복
			char Result = (char) (i + 'a'); // 현재 인덱스를 알파벳 문자로 변환 ('a'부터 시작)
			System.out.print(Result + ": "); // 알파벳 문자와 ': ' 출력
			for (int j = 0; j < frequency[i]; j++) { // 해당 알파벳의 빈도만큼 반복
				System.out.print('-'); // '-' 출력
			}
			System.out.println(); // 한 알파벳의 빈도 출력을 마친 후 줄 바꿈
		}
	}

	public static void main(String[] args) {
		OpenC openC = new OpenC(); // OpenC 클래스의 인스턴스를 생성
		openC.run(); // run 메소드를 호출하여 프로그램 실행
	}
}

// 입력 준비물 (컨트롤 + '/' 눌러서 전체 주석 해제 이후 복사 후 사용)
//It's now or never, come hold me tight
//Kiss me my darling, be mine tonight
//Tomorrow will be too late
//It's now or never, my love won't wait
//When I first saw you, with your smile so tender
//My heart was captured, my soul surrendered
//I spent a lifetime, waiting for the right time
//Now that your near, the time is here, at last
//It's now or never, come hold me tight
//Kiss me my darling, be mine tonight
//Tomorrow will be too late
//It's now or never, my love won't wait

import java.util.Scanner;
public class ex_10 {

class Dictionary {
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String korEng(String word) 
	{
		int count =0;
		for (int i = 0; i < 5; i++) {
			if (kor[i].equals(word)) {
				System.out.println(kor[i] + "은 " + eng[i]);
				count = 0;
			}
			else {
				count++;
				if (count == 5) {
					System.out.println(word + "는 저희 사전에 없습니다.");
					count = 0;
				}
			}
					
		}
		return "";
	}
	
}


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		boolean t = true;
		String find;
		
		while(t) {
			System.out.print("한글 단어?: ");
			find = scanner.next();
			if(find.equals("그만")) {
				System.out.println("프로그램이 종료되었습니다.");
				t = false;
				break;
			}
			else {		
				System.out.println(Dictionary.korEng(find));
			}
		}
		
	}
	
}




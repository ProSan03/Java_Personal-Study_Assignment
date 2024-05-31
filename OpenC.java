import java.util.*;
import java.lang.String;

public class OpenC {
	String S;

	String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line = sc.nextLine();
			if (line.equals(";"))
				break;
			sb.append(line);
		}
		return sb.toString();
	}

	public static void main(String[] args) {

	}
}

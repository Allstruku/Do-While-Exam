// Do While문은 조건이 만족되지 않더라도 최소한 한번은 While문의 block of code가 실행이된다.

import java.util.Scanner;

public class doWhileExam {
	public static void main(String[] args) {
		int value;
		Scanner scan = new Scanner (System.in);
		// Scanner는 자바에서 미리 제공하는 class이다. 어디로부터 값을 입력받고 싶다면 쓰이는 class이다. 
		// System.in은 컴퓨터 키보드에서부터 값을 입력받게 해준다.
		// Scan은 변수의 이름이다.
		do {
			value = scan.nextInt();
			//nextInt()는 오로히 정수값만 입력받게 한다. 
			System.out.println("The word that you have typed is :" + value);
			// Do문에서 먼저 code를 한번 실행한다음 밑에있는 While문 옆에 있는 조건이 맞아야 다시 do에서 시작을 합니다.
		} while (value != 10);
	
	System.out.println("The loop has ended");
	}
}

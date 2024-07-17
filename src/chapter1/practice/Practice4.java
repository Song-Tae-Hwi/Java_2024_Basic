package chapter1.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// 모두 대문자로 만들기
		// 사용자로부터 문자열 statement를 입력받고
		// 입력받은 문자열을 영어라면 모두 대문자로 변경하여
		// 문자배열에 저장한 후 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("대문자로 만들 문장을 입력하세요 : ");
		String statement = scan.nextLine();
		
		char [] arr = statement.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char charater = arr[i];
			boolean lowerEnglish = charater >= 97 && charater <= 122;
			if (!lowerEnglish) continue;
			arr[i] = (char)(charater-32);
			

		}
		System.out.print(arr);


		
	}

}

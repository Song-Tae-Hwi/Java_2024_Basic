package chapter1.practice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// 문자열 결합
		// 사용자로부터 기준 문자열, 연결할 문자열을 두개 입력받음
		// 입력받은 문자열을 문자열 배열로 변경하고 두 문자 배열을 연결
		// 새로운 문자 배열에 저장 후 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("기존 문자열 : ");
		String firstString = scanner.nextLine();
		
		System.out.print("연결할 문자열 : ");
		String secondString = scanner.nextLine();
	}
}
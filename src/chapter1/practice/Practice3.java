package chapter1.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		// 문자열 자르기
		// 사용자로부터 시작인덱스와 종료인덱스를 입력받고
		// 입력받은 시작 인덱스와 종료 인덱스까지 문자열을 잘라서
		// 자른 문자열을 출력
		
		String statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못그린 기린 그림이다.";
		char[] arr = new char[statement.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = statement.charAt(i);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번때 인덱스 : ");
		int inputString = scanner.nextInt();
		System.out.print("두번째 인덱스 : ");
		int outputString = scanner.nextInt();
		
		for(int a = inputString; a < outputString; a ++) {
			System.out.print(arr[a]);
		}
		
		
	}

}

package chapter1.practice;

import java.util.Scanner;

public class Practice1 {
	
	// 사용자로부터 0이상의 정수를 입력받고
	// 입력받은 정수를 Numbers라고하는 배열에 저장함
	// 만약 사용자가 0미만의 정수를 입력하면
	// 사용자가 입력한 정수들을 모두 출력하고 프로그램 종료
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int []numbers = new int [0];
		while (true) {
			System.out.println("정수를 입력하세요 : ");
			int i = 1;
			int num = scan.nextInt();
			int []newNumbers = new int [numbers.length + 1];
			newNumbers[i-1] = num;
			numbers[i-1] = newNumbers[i-1];
			i++;
			if(num < 0) {
				int length = newNumbers.length;
				for(int a = 0; a < length; a++) {
					System.out.println(numbers[a] + "\n");
					break;
				}
			}else {
				 continue;
			}
			
		}

	}

}

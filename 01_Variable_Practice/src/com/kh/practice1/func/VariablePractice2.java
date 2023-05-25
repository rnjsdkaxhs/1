package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	//키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱 나누기 한 몫을 구해라
	
	public void inputPractice2() {
		
		Scanner b = new Scanner(System.in);
		System.out.print("첫 번째 정수: ");
		int first = b.nextInt();
		System.out.print("두 번째 정수: ");
		int second = b.nextInt();
		System.out.println("더하기 결과: " + (first + second));
		System.out.println("빼기 결과: " + (first - second));
		System.out.println("곱하기 결과: " + (first * second));
		System.out.println("나누기 결과: " + (first / second));
		
		b.close();
		
		
	}
	
	
}

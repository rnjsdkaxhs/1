package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	//키보드로 가로,세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력
	
	public void inputPractice3(){
		
		Scanner c = new Scanner(System.in);
		
		System.out.print("가로: ");
		double a = c.nextDouble();
		System.out.print("세로: ");
		double b = c.nextDouble();
		System.out.println("면적: " + (a * b));
		System.out.println("둘레: " + ((a+b)*2));
		c.close();
		
	}
	
	
	
}

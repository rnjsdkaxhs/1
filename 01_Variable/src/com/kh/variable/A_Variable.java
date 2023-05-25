package com.kh.variable;

public class A_Variable {

//시급과 근무시간, 근무일수를 곱해서 월급을 계산해서 출력하는 메소드
	
	public void printVariable() {
	
		System.out.println("=== 변수 사용 전 ===");
		
		System.out.println("시급: 9620원");
		System.out.println("근무일수 : 6일");
		System.out.println("근무시간 : 8시간");
		
		//월급 = 시급 * 근무시간 * 근무일수
		//차은우 : 0000원 형식으로 출력
		
		System.out.println("차은우 : " + (9620 * 6 * 8) + "원");
		System.out.println("주지훈 : " + (9620 * 6 * 8) + "원");
		System.out.println("이제훈 : " + (9620 * 6 * 8) + "원");
		System.out.println("장원영 : " + (9620 * 6 * 8) + "원");
		System.out.println("최연우 : " + (9620 * 6 * 8) + "원");
		
		//변수 사용 후
		
		System.out.println("=== 변수 사용 후 ===");
		
		int pay = 9620; //자바에서 = 기호는 동등한게 아니라 9620이라는 값을 pay 라는 상자에 넣는뜻
		int date = 6;
		int hour = 8;
		
		System.out.println("차은우 : " + (pay * date * hour) + "원");
		System.out.println("주지훈 : " + (pay * date * hour) + "원");
		System.out.println("이제훈 : " + (pay * date * hour) + "원");
		System.out.println("장원영 : " + (pay * date * hour) + "원");
		System.out.println("최연우 : " + (pay * date * hour) + "원");
		
		//한줄 주석
		/*
		 * 범위
		 * 주석이
		 * 가능하다
		 */
		
		/*
		 * 변수를 사용하는 이유
		 */
		System.out.println("시급 : " + pay + "원");
		System.out.print("aaa");
		System.out.println("bbb");
		System.out.println("ccc");
	}
	
	
	// 변수의 선언을 공부하기 위한 메소드
	public void declareVariable() {
	/*
	 * 변수의 선언
	 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다.
	 * => 즉 값을 보관하기 위한 상자를 만들겠다.
	 * 
	 * [표현법] 자료형 변수이름;
	 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
	 * 변수이름: 변수의 이름을 붙여주는 부분 (의미 부여!)
	 * 
	 * 변수 선언시 주의 할 점
	 * 1. 변수 이름은 소문자로 시작/단, 낙타봉 표기법을 지킬것. 예약어는 불가
	 * 2. 같은 영역 안 ({}) 에서는 동일한 변수명으로 선언 불가. 중복이 불가능하다.
	 * 3. 해당 영역 안 ({}) 에서 선언한 변수는 그 영역 안에서만 사용 가능하다.
	 * 
	 */
		
	//--------------자료형에 대한 개념------------
	//1. 논리형 (논리값 = true/false)
	boolean isTrue;// 변수 선언
	boolean isFalse = false;//1byte, 변수 선언과 동시에 값을 대입

	isTrue = 1 + 3 > 1; // 1+3이 1보다 큽니까?
	isFalse = 4 + 2 < 2;// 4+2이 1보다 작습니까?
	//2.숫자형
	//2-1. 정수형 (소수점이 없다)
	byte bNum = 1;// 1byte (-128 ~ 127)
	short sNum = 1000; // 2byte
	int iNum = 10000; // 4byte, 정수형의 기본 자료형
	long lNum = 100000; // 8byte
	//2-2. 실수형
	float fNum = 0.0f;//4byte -> 소수점 7자리까지
					//float의 경우 double과 값을 구분하기 위해 f를 붙임.
	double dNum = 0.12345;//8byte -> 소수점 15자리까지 표현 가능,실수형의 기본자료형
	
	//3. 문자형
	//3-1. 문자
	char ch = 'a';//2byte 작은따옴표로 담아야함
	char kim;
	kim = '김';
	//3-2. 문자열
	String str;//참조자료형 색 안바뀜
	str = "abc";
	//값이 잘 담겨있는지 확인
	System.out.println("isTrue : " + isTrue);
	System.out.println("isFalse : " + isFalse);
	System.out.println("bNum : " + bNum);
	System.out.println("sNum : " + sNum);
	System.out.println("iNum : " + iNum);
	System.out.println("lNum : " + lNum);
	System.out.println("fNum : " + fNum);
	System.out.println("dNum : " + dNum);
	System.out.println("ch : " + ch);
	System.out.println("kim : " + kim);
	System.out.println("str : " + str);
	}
	

}

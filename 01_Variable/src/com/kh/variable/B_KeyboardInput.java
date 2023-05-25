package com.kh.variable;

import java.util.Scanner;

//사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboardInput {

	public void inputTest1() {

		/*
		 * 키보드로 값을 입력받는 방법
		 * Scanner를 사용한다
		 * java.util.Scanner 클래스를 이용하는 것
		 * Scanner 클래스 내 부의 nextLine메소드를 호출해서 입력받는것
		 * Scanner 사용 후에는 close로 반납해줌
		 */
		//스캐너 생성(new)하는 문법
		Scanner sc = new Scanner(System.in);
		//System.in은 입력받은 값을 바이트 단위로 받아들이겠다는 의미

		System.out.print("아무거나 입력해보세요: ");
		String message = sc.nextLine();
		
		System.out.println("입력받은 내용: " + message);
		
		
	}
	public void inputTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까?: ");
		String message = sc.nextLine();
		//System.out.println("당신의 이름은 " + message);
		
		
		//사용자가 입력한 값을 문자열로 받아오는 메소드(nextLine(), next())
		//next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어옴
		//따라서 거주지처럼 공백이 있는 데이터는 제대로 된 값을 못 가져올 수 도 있다.
		//nextLine()을 사용 하면 공백도 가능!
		//nextLine(): 사용자가 입력한 엔터 전까지의 모든 값을 읽어온다
		System.out.print("당신의 나이는 몇 살입니까? : ");
		int age = sc.nextInt();//사용자가 입력한 값을 정수로 읽어들이는 메소드
		//System.out.println("당신의 나이는 " + age + "살 입니다.");
		System.out.print("당신의 키는 몇 cm입니까? (소수점 첫째 자리까지 입력하세요) : ");
		double height = sc.nextDouble();//사용자가 입력한 값을 실수로 읽어들이는 메소드
		//System.out.println("당신의 키는 " + height + " cm 입니다.");
		System.out.println(message + "님은 " + age + "살이며, 키는 " + height + "cm 입니다. ");
		sc.close();
		
		
		
		
	}
//키보드로 값을 입력 받을 때 종종 발생되는 문제
	public void inputTest3() {
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();//버퍼에 남아있는 엔터를 비워주는 코드를 추가하기
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.print("키 : ");
		Double height = sc.nextDouble();
		sc.close();
//xxx님은 xx살이며, 사는곳은 xxx이고, 키는 xxx.xcm입니다.
		System.out.println(name + "님은 " + age + "살이며, 사는곳은 " + address + "이고, 키는 " + height + "cm 입니다.");
	}
	public void inputTest4() {
		Scanner sc = new Scanner(System.in);
		
		//문자열을 입력 받을 때 -> sc.nextLine() sc.netx() -> 문자만 공백까지만
		//정수값을 입력 받을 때 -> sc.nextInt()
		//실수값을 입력 받을 때 -> sc.nextDouble()
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("성별(M/F) : ");
		//char gender = sc.nextChar(); //next Char() 같은 메소드는 없다.
		char gender = sc.nextLine().charAt(0);
		//문자열.charAt(index) : 해당 문자열로부터 해당 index의 문자를 추출해주는 메소드
		//**index : 순번. 단, 0부터 시작한다.
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		/*
		 * xxx님의 개인정보
		 * 성별: x
		 * 나이: xx
		 * 키 : xxx.x
		 */
		
		
		System.out.println(name + "님의 개인정보" + System.lineSeparator() +
				"성별: " + gender +System.lineSeparator() + 
				"나이: " + age + System.lineSeparator() +
				"키 :" + height );
		
	}
	
	public void charAtTest() {
		
		String str = "Hello";
		//변수에 기록하여 출력하는 방식
		char ch = str.charAt(0); // H
		System.out.println(ch);
		
		//바로 출력하는 방식
		System.out.println(str.charAt(3));
		//System.out.println(str.charAt(12));
		//존재하지 않는 인덱스: 오류발생
		//java.lang.StringIndextOutofBoundsException
	}
	
	/*
	 * **정리**
	 * 1. 콘솔창에 (모니터) 출력하기 위해선 System.out.print[ln]() 메소드 이용
	 * 2. 콘솔창에 (키보드) 입력받기 위해 Scanner 이용 (nextLine(), next(), nextInt()
	 * 											nextInt(), nextDouble() 등 이용)
	 * > 주의사항
	 * 1) sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드 올경우 
	 *    sc.nextLine() 메소드 한번 사용해서 버퍼를 비워준다
	 * 2)'문자' 값을 입력 받아야 할 경우
	 * 	 sc.nextLine() 메소드를 통해 우선 문자열로 받고 .charAt(Index)메소드를 통해 문자하나 추출
	 *     
	 */
}

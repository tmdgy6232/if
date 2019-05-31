package com.biz.if_then;

public class If_01 {

	public static void main(String[] args) {

		/*
		 * 비교, 조건문
		 * 
		 * 어떤 조건에 따라서 코딩의 흐름을 변경하는것
		 * 제어문이라고도 한다.
		 * if문은 괄호안에 boolean형의 값이 들어감 
		 */
		
		if(1==1) {
			System.out.println("1은 1이다");
		}
		if(1 != 1) {
			System.out.println("1은 1이 아니다");
		}
		
		int intNum = 30;
		if(intNum > 30) {
			System.out.println(intNum + " 는 30보다 크다");
			
		}
		
	}

}

package com.biz.if_then;

public class If_03 {

	public static void main(String[] args) {

		if( 30 > 20) {
			System.out.println("30은 20보다 크다");
		}
		if(30 < 20) {
			// 조건문이 true이면 실행되는 명령들
			System.out.println("30은 20보다 작다");
		}else {
			// 조건문이 true가 아니면 실행되는 명령들
			System.out.println("30은 20보다 크다");
		}
		if(30<20) {
			System.out.println("30은 20보다 작다");
		}else if(30==20) {
			System.out.println("30과 20은 같다");
		}else {
				System.out.println("잘모르겠다.");
			}
		
		if(30<20) {
			System.out.println("30은 20보다 작다");
		} else if(30==20) {//false
			System.out.println("30은 20과 같다");
		}else if( 30 != 20) { //true
			//다중 조건문에서 도중에 한번이라도 true가 나오면
			// 그 이후 else 관련된 문장은 건너뛴다.
			System.out.println("30ㄱ은 20과 다르다");
		} else { //무시
			System.out.println("잘모르겠다.");
		}
		
		
		
		}
	}


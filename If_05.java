package com.biz.if_then;

public class If_05 {
	public static void main(String[] args) {
	
		
		
		for (int i=1; i<100; i++) {
			// i를 6으로 나누었을 때 나머지가 0인 수
			// 최초로 나타나는 6의 배수만 보고싶다
			if(i % 6 ==0) {
				System.out.println(i+"는 6의 배수입니다.");
				break;
				
				//for문 실행중에 브레이크를 만나면 for 반복문을 중단한다.
				//브레이크는 for 반복문 내에서만 사용 가능하다.
			}
			
			}
		}
}

		


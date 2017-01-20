package practice01;

import java.util.*;

public class Prob3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int result = 0;

		System.out.print("숫자를 입력하세요 : ");
		int num = in.nextInt();
		for(int i = 0; i <= num; i++){
			if(num % 2 == 0){
				if(i % 2 == 0){
					result += i;
				}

			}else{
				if(i % 2 == 1){
					result += i;
				}
			}
		}
		System.out.println("결과 값 : " + result);
	}
}
package practice01;

import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		for(int i = 0; i < 100; i++) {
			if(( i / 10 == 3 || 
				 i / 10 == 6 || 
				 i / 10 == 9 ) && 
			   ( i % 10 == 3 || 
			     i % 10 == 6 || 
			     i % 10 ==9 )) {
				System.out.println(i + " 짝짝");
			}	else if(( i / 10 == 3 ||
						  i / 10 == 6 || 
						  i / 10 == 9 ) || 
						( i % 10 == 3 || 
						  i % 10 == 6 || 
						  i % 10 == 9 )) {
				System.out.println(i + " 짝");
			}
		}
	}
}
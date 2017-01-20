package practice01;


public class Prob2 {

	public static void main(String[] args) {
		int num = 10;
		for(int i = 1; i < num; i++){
			for(int j = i; j < num + i; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
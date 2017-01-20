package practice01;

public class Prob4 {
	public static void main(String[] args) {
		//String Method Test
		String s = "Bat Man";
		int lenth = s.length();
		
		for(int i = 0; i < lenth; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(s.charAt( j ));
			}
			System.out.println();
		}
	}
}
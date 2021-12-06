package JavaPractice3;

public class practice6 {
	public static void main(String[] args) {
		int x = -65;
		if (x >= 0 && x % 2==0) {
			System.out.println("xは正の偶数です。");
		}else if (x >= 0 && x % 2 != 0) {
			System.out.println("xは正の奇数です。");
		}else if (x < 0 && x % 2 == 0) {
			System.out.println("xは負の偶数です。");
		}else {
			System.out.println("xは負の奇数です。");
		}
	}

}

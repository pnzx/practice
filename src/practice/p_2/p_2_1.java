package practice.p_2;

public class p_2_1 {
	
	public static int sum(int n, int m) {
		return n + m;
	}
	// main()메소드에서 실행 시작
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10);
		a = '?';
		System.out.println(a); // 문자 '?' 화면 출력
		System.out.println("Hello"); // "Hello"문자열 화면 출력
		System.out.println(s); // 정수 s값 화면 출력
	}

}

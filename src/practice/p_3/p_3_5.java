package practice.p_3;

import java.util.Scanner;

public class p_3_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 5개를 입력하세요: ");
		int sum = 0;
		for(int i=0;i<5;i++) {
			int n = scanner.nextInt();
			if(n>0)
				sum += n;
			else
				continue;
		}
		System.out.print(sum);
		
		scanner.close();

	}

}

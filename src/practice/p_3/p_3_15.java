package practice.p_3;

import java.util.Scanner;

public class p_3_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("나뉨수를 입력하시요: ");
			int dividend = scanner.nextInt();
			System.out.print("나눗수를 입력하세요: ");
			int divisor = scanner.nextInt();
			try {
				System.out.println(dividend+"를 "+divisor+"로 나눈면 몫은 "+dividend/divisor+"입니다");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 못나눔");
			}
		}
		scanner.close();

	}

}

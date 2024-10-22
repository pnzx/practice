package practice.p_3;

import java.util.Scanner;

public class p_3_6 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = n.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("종료합니다.");
		n.close();

	}

}

package practice.p_3;

import java.util.Scanner;

public class p_3_7 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		int intArray[] = new int[5];
		
		int max = 0;
		System.out.print("양수 5개를 입력하세요. ");
		for(int i=0;i<5;i++) {
			intArray[i] = n.nextInt();
			if(intArray[i]>max)
				max = intArray[i];
		}
		System.out.println(max);
		n.close();
	}

}

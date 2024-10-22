package practice.p_3;

import java.util.Scanner;

public class p_3_8 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;
		System.out.print(intArray.length + "개의 정수를 입력하세요>> ");
		
		for(int i=0;i<intArray.length;i++)
			intArray[i] = n.nextInt();
		
		for(int i=0;i<intArray.length;i++)
			sum += intArray[i];
		
		System.out.print("평균은 " + (double)sum/intArray.length);
		n.close();

	}

}

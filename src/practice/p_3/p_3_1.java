package practice.p_3;

public class p_3_1 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=10;i++) {
			sum += i;
			System.out.print(i);
			
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
		}

	}

}
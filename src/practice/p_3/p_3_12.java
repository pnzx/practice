package practice.p_3;

public class p_3_12 {
	
	static int[] makeArray() {
	int temp[] = new int[4];
	for(int i=0;i<temp.length;i++)
		temp[i]=i;
	return temp;
	}

	public static void main(String[] args) {
		int intArray[] = new int[4];
		intArray = makeArray();
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+1 +" ");
	
	for(int i=0;i<intArray.length;i++)
		System.out.print(intArray[i] +" ");
	}
}

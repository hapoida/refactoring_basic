package CH03.IntroduceAssertion.first.after;

import java.util.Random;

public class Main {
	private static final Random random = new Random(1234);
	
	private static void execute(int length){

		//난수로 데이터 작성
		int[] data = new int[length];
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(data.length);
		}
		
		//데이터표시
		SortSample sorter = new SortSample(data);
		System.out.println("BEFORE : " + sorter);
		
		sorter.sort();
		System.out.println(" AFTER : " + sorter);
		
		System.out.println();
	}
	
	public static void main(String[] args){
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		execute(10);
	}
}

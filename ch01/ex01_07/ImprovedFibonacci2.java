package ch01.ex01_07;

public class ImprovedFibonacci2 {
	static final int MAX_INDEX = 9;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int lo = 1;
		int hi = 1;
		String mark;
		
		System.out.println("Fibonacci");
		System.out.println(MAX_INDEX + ": " + lo);
		
		for(int i = MAX_INDEX-1; i >= 1; i--){
			if(hi % 2 == 0){
				mark = " *";
			}
			else{
				mark = "";
			}
			System.out.println(i + ": " + hi + mark);
			hi = lo + hi;
			lo = hi - lo;
			
		}

	}

}

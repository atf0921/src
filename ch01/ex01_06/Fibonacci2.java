package ch01.ex01_06;

public class Fibonacci2 {
	static final String Progression  = "Fibonacci";
	/**文字列リテラルProgression(数列）を定義*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int io = 1;
		int hi = 1;
		System.out.println(Progression);
		System.out.println(io);
		
		while(hi<50){
			System.out.println(hi);
			hi=io + hi;
			io=hi-io;
		}
	}
}


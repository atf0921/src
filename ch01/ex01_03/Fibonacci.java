package ch01.ex01_03;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int io = 1;
		int hi = 1;
		System.out.println("Fibonacci");
		System.out.println(io);
		
		while(hi<50){
			System.out.println(hi);
			hi=io + hi;
			io=hi-io;
		}

	}

}

package ch01.ex01_10;

public class ImprovedFibonacci2 {
	  public static final int MAX_INDEX = 9; 
	  static void fib(){
	  int[] hi = new int [MAX_INDEX];
	  int[] io = new int [MAX_INDEX];
		 hi[0] = 1;
		 
		 for(int i = 0;i<MAX_INDEX;i++){
			if(i<=1){
				hi[i]=1;
			}
			else{
				hi[i] = hi[i-1] + hi[i-2];
			}
			io[i] = evenumber(hi[i]);
			System.out.print(hi[i]+" : ");
			System.out.println(io[i]);
		 }
	  }
	  static int evenumber(int x){
		  int lo;
			  if(x%2==0){
				  lo = 1;
			  }
			  else{
				  lo=0;
			  }
			  return lo;
		  }

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		fib();
	 

	}

}

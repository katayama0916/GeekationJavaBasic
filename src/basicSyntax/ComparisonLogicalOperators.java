package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		//1・int型の変数aとbを定義&任意の値を代入して、aがbより大きい場合にtrueをそうでない場合にfalseと出力するプログラムを実装してください。
		int a=2;
		int b=1;
		boolean isGreater=(a>b);
		System.out.println(isGreater);
		
		
		//2・boolean型の変数isSunnyとisWarmが与えられたとき、天気が晴れかつ暖かい場合にtrueを、それ以外の場合にfalseと出力するプログラムを実装してください。
	    boolean isSunny = true; 
		boolean isWarm = true;  
		boolean andResult1 =(isSunny && isWarm);
		System.out.println(andResult1);
		
		
		//3・int型の変数int xとint yを定義&任意の値を代入して、xが0以上かつyが偶数の場合にコンソールにtrueと出力するプログラムを実装してください。
		int x= 2;
		int y= 4;
		boolean andResult2 =(x >= 0 && y % 2 == 0);
	    System.out.println(andResult2);
	    
	    
	    //4・boolean型の変数hasPermissionを定義して、hasPermissionがfalseの場合にtrueと出力する
	    boolean hasPermission =false;
	      boolean notResult = !(hasPermission);
	    System.out.println(notResult);
		
		
		

	}

}

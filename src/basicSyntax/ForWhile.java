package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		//		1. 1〜100までの数字を順にコンソールに出力してください。ただし、下記の条件を満たしてください。(これはFizzBuzz問題と言われ、プログラミングではよく使われる問題です。)
		for(int num=1;num<=100;num++){
			if (num%3==0 && num%5==0){
				System.out.println("fizzbuzz");
			}else if (num%3==0){
				System.out.println("fizz");
			}else if (num%5==0){
				System.out.println("buzz");
			}
			else {
				System.out.println(num);
			}
		}

		//		2. 繰り返し処理を行って、条件によって処理を分けてください。
		String[] languages={"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};

		for (String language:languages ){
			if (language.equals("Java")){
				System.out.println("現在学習中の言語はJavaです。");
				continue;
			}else if (language.equals("HTML")){
				System.out.println("HTMLはプログラミング言語ではありません。");
				break;
			}else{
				System.out.println(language);
			}
		}

	}
}

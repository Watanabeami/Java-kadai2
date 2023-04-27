package jp.cp.aforce.practice;

public class PracticeTest6 {
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt();
		//練習問題１	
		switch(r) {
			case  1:
				System.out.println("吉です");
		        break;
			case 2:
				System.out.println("中吉です");
				break;
			case 3:
				System.out.println("大吉です");
				break;
			default:
				System.out.println("凶です");
				break;
			}
		//練習問題２
		int amount = 1;
		while(amount <= 100) {
			if(amount % 7 == 0) {
		    System.out.println(amount + ",");
			}
			amount++;
			System.out.println();
		}
		//練習問題３
		for(int x = 1; x < 10; x++) {
	    for(int y = 1; y < 10; y++) {
	    	System.out.println(x*y);
	    }
		}
	}
}

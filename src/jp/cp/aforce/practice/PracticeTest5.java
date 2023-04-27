package jp.cp.aforce.practice;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest5 {
	public static void main(String[] args) {
	//練習問題２
    ArrayList<String> names = new ArrayList<>();
    names.add("犬");
    names.add("猫");
    names.add("うさぎ");
    names.add("へび");
    //練習問題３
    String animal = "犬";
    	  if(names.contains(animal)) {
    		System.out.println(animal + "はリストに含まれています");
    	} else {
    		System.out.println(animal + "はリストに含まれていません");
    	}
     //練習問題４
     Calendar calendar = Calendar.getInstance();
	 int month = calendar.get(Calendar.MONTH) + 1;
		
		switch(month){
		case 1:
			System.out.println("冬物セール");
			break;
		case 2:
			System.out.println("春物を売る");
			break;
		case 3:
			System.out.println("春物を売る");
			break;
		case 4:
			System.out.println("春物を売る");
			break;
		case 5:
			System.out.println("春物セール");
			break;
		case 6:
			System.out.println("夏物を売る");
			break;
		case 7:
			System.out.println("夏物を売る");
			break;
		case 8:
			System.out.println("夏物セール");
			break;
		case 9:
			System.out.println("秋物を売る");
			break;
		case 10:
			System.out.println("冬物を売る");
			break;
		case 11:
			System.out.println("冬物を売る");
			break;
		case 12:
			System.out.println("冬物を売る");
			break;
		default:
			System.out.println("不正な月です");
		}
     }
 }


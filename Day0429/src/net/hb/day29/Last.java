package net.hb.day29;

import java.util.Scanner;

public class Last {
	public static void main(String[] args ) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("월수 입력? ");
		int month = stdin.nextInt(); //키보드 입력받아서 월의 일수 표시
		String day="";
		String msg = "월의 달 표시";
		switch(month){
		
		case 1: day="31"; break; 
		case 2: day="28"; break;
		case 3: day="31"; break;
		case 4: day="30"; break;
		case 5: day="31"; break;
		case 6: day="30"; break;
		case 7: day="31"; break;
		case 8: day="31"; break;
		case 9: day="30"; break;
	  case 10: day="31"; break;
		case 11: day="30"; break;
		case 12: day="31"; break;
		default : day="??"; break;
		}// switch end
		System.out.println(month+"월은 "+day+"일 까지 입니다.");
		

}
}
package net.hb.day29;

import java.util.Scanner;

public class Home {
	public static void main(String[] args ) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("월수 입력? ");
		int month = stdin.nextInt(); //키보드 입력받아서 월의 일수 표시
		String day="";
		String msg = "";
		if(month==1){day="31";}else
		if(month==2){day="28";}else
		if(month==3){day="30";}else 
		if(month==4){day="31";}else			
		if(month==5){day="31";}else			
		if(month==6){day="30";}else			
		if(month==7){day="31";}else			
		if(month==8){day="31";}else				
		if(month==9){day="30";}else			
		if(month==10){day="31";}else			
		if(month==11){day="30";}else
		if(month==12){day="31";}
		
		if(month>=1&&month<=12){msg=month+"월은 "+day+"일 까지 입니다.";}else
		{msg="월을 다시 입력해 주세요";}
		System.out.println(msg);
		

}
}
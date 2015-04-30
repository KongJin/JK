package net.hb.day29;
import java.util.Scanner;
public class SwitchTest1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("월 입력? ");
		int month= stdin.nextInt();//정수형 입력
		String Mtos="안내문";
				
		switch(month){
		case 12: Mtos="겨울입니다."; break;
		case 1: Mtos="겨울입니다."; break;
		case 2: Mtos="겨울입니다."; break;
		
		case 3: Mtos="봄입니다."; break;
		case 4: Mtos="봄입니다."; break;
		case 5: Mtos="봄입니다."; break;
		
		case 6: Mtos="여름입니다."; break;
		case 7: Mtos="여름입니다."; break;
		case 8: Mtos="여름입니다."; break;
		
		case 9: System.out.print("멋진 "); Mtos="가을입니다."; break;
		case 10: System.out.print("아름다운 "); Mtos="가을입니다."; break;
		case 11: System.out.print("낙엽의 "); Mtos="가을입니다."; break;
		
		}//switch end
		
		System.out.println(month+"월은 "+Mtos);
		
	}//main end
}//class END






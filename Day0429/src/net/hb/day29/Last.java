package net.hb.day29;

import java.util.Scanner;

public class Last {
	public static void main(String[] args ) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("���� �Է�? ");
		int month = stdin.nextInt(); //Ű���� �Է¹޾Ƽ� ���� �ϼ� ǥ��
		String day="";
		String msg = "���� �� ǥ��";
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
		System.out.println(month+"���� "+day+"�� ���� �Դϴ�.");
		

}
}
package net.hb.day29;
import java.util.Scanner;
public class SwitchTest1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("�� �Է�? ");
		int month= stdin.nextInt();//������ �Է�
		String Mtos="�ȳ���";
				
		switch(month){
		case 12: Mtos="�ܿ��Դϴ�."; break;
		case 1: Mtos="�ܿ��Դϴ�."; break;
		case 2: Mtos="�ܿ��Դϴ�."; break;
		
		case 3: Mtos="���Դϴ�."; break;
		case 4: Mtos="���Դϴ�."; break;
		case 5: Mtos="���Դϴ�."; break;
		
		case 6: Mtos="�����Դϴ�."; break;
		case 7: Mtos="�����Դϴ�."; break;
		case 8: Mtos="�����Դϴ�."; break;
		
		case 9: System.out.print("���� "); Mtos="�����Դϴ�."; break;
		case 10: System.out.print("�Ƹ��ٿ� "); Mtos="�����Դϴ�."; break;
		case 11: System.out.print("������ "); Mtos="�����Դϴ�."; break;
		
		}//switch end
		
		System.out.println(month+"���� "+Mtos);
		
	}//main end
}//class END






package net.hb.day29;

import java.util.Scanner;

public class Home {
	public static void main(String[] args ) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("���� �Է�? ");
		int month = stdin.nextInt(); //Ű���� �Է¹޾Ƽ� ���� �ϼ� ǥ��
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
		
		if(month>=1&&month<=12){msg=month+"���� "+day+"�� ���� �Դϴ�.";}else
		{msg="���� �ٽ� �Է��� �ּ���";}
		System.out.println(msg);
		

}
}
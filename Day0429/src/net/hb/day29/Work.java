package net.hb.day29;

import java.util.Scanner;

public class Work {
	public static void main(String[] args ) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("���� �Է�? ");	
		 
		try{	
		int su = stdin.nextInt(); //Ű���� �Է¹޾Ƽ� ���� ǥ��
		int nmg = su%2;
		String msg = "";
		if(nmg==0){msg=su+"�� ¦�� �Դϴ�.";}
	  else {msg=su+"�� Ȧ�� �Դϴ�.";}
		
		if(nmg!=1&&nmg!=0){msg="������ �Է��ϼ���.";}
		
	  System.out.println(msg);
		
		}catch(Exception ex){}	
		
		
		System.out.println("\n���������� ��������������");

}
}
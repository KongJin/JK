package net.hb.day29;

import java.util.Scanner;


public class Four {
	public static void main(String[] args) {
		System.out.println("Four.java");
  	Scanner stdIn=new Scanner(System.in);
		System.out.print("���� �Է� ");
		int grade = stdIn.nextInt();
		if (grade>=80){System.out.println("��� �������� ���մϴ�");
		if(grade>=90) System.out.println("A �����Դϴ�");
		else System.out.print("B �����Դϴ�");}
		else {if(grade>=60){System.out.println("���� �������� ���մϴ�");
		if(grade>=70) System.out.println("C �����Դϴ�");
		else System.out.print("D �����Դϴ�");}
		else System.out.print("���� ��� ����");
}
	}
}

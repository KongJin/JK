package net.hb.day29;

import java.util.Scanner;


public class MultiIFtest1 {
	public static void main(String[] args) {
		System.out.println("MultiIFtest1.java");
  	Scanner stdIn=new Scanner(System.in);
		System.out.print("���� �Է� ");
		int grade = stdIn.nextInt();
		if (grade>=80){System.out.println("��� �������� ���մϴ�");}
		else if(grade>=90) System.out.println("A �����Դϴ�");
		else System.out.print("B �����Դϴ�");
	}//main end
} //class EnD

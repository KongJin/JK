package net.hb.day29;

import java.util.Scanner;


public class Four {
	public static void main(String[] args) {
		System.out.println("Four.java");
  	Scanner stdIn=new Scanner(System.in);
		System.out.print("성적 입력 ");
		int grade = stdIn.nextInt();
		if (grade>=80){System.out.println("우수 학점군에 속합니다");
		if(grade>=90) System.out.println("A 학점입니다");
		else System.out.print("B 학점입니다");}
		else {if(grade>=60){System.out.println("보통 학점군에 속합니다");
		if(grade>=70) System.out.println("C 학점입니다");
		else System.out.print("D 학점입니다");}
		else System.out.print("학점 취득 실패");
}
	}
}

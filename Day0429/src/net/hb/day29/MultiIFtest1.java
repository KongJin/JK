package net.hb.day29;

import java.util.Scanner;


public class MultiIFtest1 {
	public static void main(String[] args) {
		System.out.println("MultiIFtest1.java");
  	Scanner stdIn=new Scanner(System.in);
		System.out.print("성적 입력 ");
		int grade = stdIn.nextInt();
		if (grade>=80){System.out.println("우수 학점군에 속합니다");}
		else if(grade>=90) System.out.println("A 학점입니다");
		else System.out.print("B 학점입니다");
	}//main end
} //class EnD

package net.hb.day29;

import java.util.Scanner;

public class Work {
	public static void main(String[] args ) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("숫자 입력? ");	
		 
		try{	
		int su = stdin.nextInt(); //키보드 입력받아서 정수 표시
		int nmg = su%2;
		String msg = "";
		if(nmg==0){msg=su+"는 짝수 입니다.";}
	  else {msg=su+"는 홀수 입니다.";}
		
		if(nmg!=1&&nmg!=0){msg="정수로 입력하세요.";}
		
	  System.out.println(msg);
		
		}catch(Exception ex){}	
		
		
		System.out.println("\n마지막문장 영수증같은역할");

}
}
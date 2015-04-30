package net.hb.day29;


import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
	System.out.print("과일 입력");
	
	Scanner stdIn = null;
	String msg=stdIn.next();
	
  String msg2;
	if(msg.equals("포도")){msg2="보라색";}
	else if(msg.equals("귤")){msg2="주황색";}
	else if(msg.equals("사과")){msg2="빨간색";}
	else{msg2="모름";}
	System.out.print(msg+"="+msg2);
	
	int su=stdIn.nextInt();
	String su2;
if(su%2==0){su2="짝수";}else{su2="홀수";}
  System.out.print(su+"="+su2);
	
	
	
	
	
	
	
	
	
	}}

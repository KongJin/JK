package net.hb.day28;
import java.util.Scanner;
public class KeyboardInput2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("KeyboardInput2.java");
		System.out.print("이름,나이,몸무게 입력");
		String name= stdIn.next();
		int i= stdIn.nextInt();
		double d= stdIn.nextDouble();		
		System.out.print(name+"씨의 나이는"+i+"이고");
		System.out.print("몸무게는"+d+"입니다");
	}//main end
}//class END

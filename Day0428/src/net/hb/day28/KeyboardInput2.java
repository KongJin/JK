package net.hb.day28;
import java.util.Scanner;
public class KeyboardInput2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("KeyboardInput2.java");
		System.out.print("�̸�,����,������ �Է�");
		String name= stdIn.next();
		int i= stdIn.nextInt();
		double d= stdIn.nextDouble();		
		System.out.print(name+"���� ���̴�"+i+"�̰�");
		System.out.print("�����Դ�"+d+"�Դϴ�");
	}//main end
}//class END

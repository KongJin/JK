package net.hb.day29;

public class First {
	public static void main(String[] args) {
		System.out.println("First.java");
		int kor=85,eng=90,sum=0;
		double avg=0.0;
		String msg="�ȳ���";
		sum=kor+eng;
		avg=(double) sum/2;
		if(avg>=70.0){msg="������ �հ��߽��ϴ�.";}
		else{msg="������� ���ž� �մϴ�.";}
		System.out.println("����="+kor);
		System.out.println("����="+eng);
		System.out.println("����="+sum);
		System.out.println("���="+avg);
		System.out.println(msg);
		
		
	}
}
package net.hb.day29;

public class Two {
	public static void main(String[] args) {
		System.out.println("Two.java");
		int kor=55,eng=90,sum=0;
		double avg=0.0;
		String msg="안내문";
		sum=kor+eng;
		avg=(double) sum/2;
		
		if(avg>=70.0 && kor>=60 || eng>=60){msg="시험을 합격했습니다.";}
		else{msg="재시험을 보셔야 합니다.";}
		System.out.println("국어="+kor);
		System.out.println("영어="+eng);
		System.out.println("총점="+sum);
		System.out.println("평균="+avg);
		System.out.println(msg);
		
		
	}
}
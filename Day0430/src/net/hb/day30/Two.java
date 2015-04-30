package net.hb.day30;

public class Two {
 public static void main(String[]args){
	 int a = 0,b = 0,c = 0;
	 int sum1 = 0, sum2 = 0,sum3 = 0;
	 
	 for(int i=1; i<=10; i=i+1){
		 a++;
		System.out.print(a + " ");
		if(a%10==0){System.out.println();}
		sum1= sum1+a; //���� ������

	 }//for end
	 
		System.out.println("\n합계="+sum1);
  }//main end
 }//class END
 
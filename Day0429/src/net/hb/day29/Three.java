package net.hb.day29;

public class Three {
	public static void main(String[] args) {
		System.out.println("Three.java");
		int kor=85,eng=90,sum=0;
		double avg=0.0;
		sum=kor+eng;
		avg=(double) sum/2;
		char grade='F';
	
	
		 switch((int)avg/10){ //85,89,80,84,87
		  case 10: grade='A'; break;
		  case 9: grade='A'; break;
		  case 8: grade='B'; break;
		  case 7: grade='C'; break;
		  case 6: grade='D'; break;
		  default: grade='F'; break;
		}
		
		System.out.println("±¹¾î="+kor);
		System.out.println("¿µ¾î="+eng);
		System.out.println("ÃÑÁ¡="+sum);
		System.out.println("Æò±Õ="+avg);
		System.out.println("ÇÐÁ¡="+grade);		
		
	}
}
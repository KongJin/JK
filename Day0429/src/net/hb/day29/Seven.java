package net.hb.day29;

public class Seven {
	public static void main(String[] args) {
		int kor=50, eng=100, sum=0;
		double avg=0.0;
		char grade='F';	
		
		sum=kor+eng;
		avg=(double)sum/2 ;
		
		//if(avg>=90){ grade='A';  }
		//else if(avg>=80){ grade='B'; }
		//else if(avg>=70){ grade='C'; }
		//else if(avg>=60){ grade='D'; }
		//else { grade='F'; }
		
		switch( (int)avg/10 ){
		case 10: grade='A'; break;
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F'; break;
		}//switch end
				
		
		System.out.println( "±¹¾î=" + kor);
		System.out.println( "¿µ¾î=" + eng);
		System.out.println( "ÃÑÁ¡=" + sum);
		System.out.println( "Æò±Õ=" + avg);
		System.out.println( "ÇÐÁ¡=" + grade);
	}//main end
}//class END






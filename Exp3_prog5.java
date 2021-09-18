package oopsjava1;

public class Exp3_prog5 {

	public static void main(String[] args) {
		
		for(int i=456; i<567; i++) {
			int sum=0;
			if(i%4==0) {
				for(int div=i; div/1!=0; div=div/10) {
					sum+=(div%10);
				}
				System.out.println("Number= "+i+" Sum of digits= "+sum);
			}
		}
	}

}

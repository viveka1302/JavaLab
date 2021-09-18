package oopsjava1;

public class Exp3_prog4 {
	//>40, <250, div by 5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=41; i<250; i++) {
			if(i%5==0) {
				sum+=i;
			}
		}
		System.out.println("Sum= "+sum);
	}

}

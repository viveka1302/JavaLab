package oopsjava1;

import java.util.Scanner;

public class Exp3_pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] arr=new int[3];
		for(int i=0; i<3; i++) {
			arr[i]= sc.nextInt();
		}
		for(int m=0; m<3; m++) {
			for(int n=0; n<3; n++) {
				for(int o=0; o<3; o++) {
					if(m!=n && m!=o && n!=o) {
						System.out.println(arr[m]+""+arr[n]+""+arr[o]);
					}
				}
			}
		}
	}

}

package oopsjava1;

import java.util.Scanner;

public class Exp3_prog2 {

	public static int[] square(int[] a) {
		int len=a.length;
		int[] sq= new int[len];
		
		for(int i=0; i<len; i++) {
			sq[i]=a[i]*a[i];
		}
		return sq;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[10];
		System.out.println("Enter 10 numbers: ");
		
		for(int i=0; i<10; i++) {
			arr[i]=sc.nextInt();
		}
		int[] sq= new int[10];
		sq=square(arr);
		int sum=0;
		for(int j=0; j<10; j++) {
			System.out.println(sq[j]);
			sum+=sq[j];
		}
		System.out.println("Sum= "+sum);
	}

}

package Task;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void mian(String args[])
	{
		int r = 1 + (int)(100 * Math.random());
		int k=5;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess The number b/w 1 to 100 with 5 chonces");
		int guess=sc.nextInt();
		for(i=0;i<k;i++) {
			System.out.println("Guess The Number");
			if(r==guess) {
				System.out.println("Congrats You Guess Correct Number");
				break;
			}
			else if(r>guess&&i!=k-1) {
				System.out.println("You Guess The Grater Than Number");
			}
			else if(r<guess&&i!=k-1) {
				System.out.println("You Guess The Less Then Number");
			}
		}
		if(i==k) {
			System.out.println("You have Completed 5 Choices");
		}
		System.out.println(r);
		
	}
}

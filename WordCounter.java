package Task;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Words");
		String s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("Number of the words in the String: "+count);
	}

}

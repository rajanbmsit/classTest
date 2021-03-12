package classTest;

import java.util.Scanner;

public class exp6 {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter n");
		int n=Integer.parseInt(sc.nextLine());
		String result="";
		while(n>0)
		{
			result+=str.substring(0,n);
			n--;
		}
		System.out.println(result);
	}
	

}
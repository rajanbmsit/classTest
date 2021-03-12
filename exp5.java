package classTest;

import java.util.Scanner;
public class exp5 {
public static String repeatEnd(String str, int n) {
 str = str.substring(str.length()-n);
 String s = "";
 for(int i=0; i < n; i++) {
   s = s + str;
 }
 return s;
}

public static void main(String[] args)
 {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the word");
String st = sc.nextLine();
int x =0;
System.out.println("Enter the number");
x = sc.nextInt();
System.out.println(repeatEnd(st,x));
 }
}

package cycle2;
import java.util.Scanner;

public class StringMethods {



	public static void main(String[] args) {

		

	    Scanner sc=new Scanner(System.in);

		System.out.println("enter your string1:");

		String str1=sc.nextLine();

		Scanner sc1=new Scanner(System.in);

		System.out.println("enter your string2:");

		String str2=sc1.nextLine();
		
		System.out.println("enter another index number:");
		
		int i;

		Scanner s=new Scanner(System.in);

		i=s.nextInt();

		System.out.println("1.Length of the first string:"+str1.length());

		System.out.println("2.Concatenation of strings:"+str1.concat(str2));
		
		System.out.println("3.Converting first string to lowercase:"+str1.toLowerCase());

		System.out.println("4.Converting second string to uppercase:"+str2.toUpperCase());

		System.out.println("5.Both strings are equal or not:"+str1.equals(str2));
		
		System.out.println("6.Is first string is empty:"+str1.isEmpty());

		System.out.println("7.Removing whitespaces from string1:"+str1.trim());

		System.out.println("8.Character at index number"+" "+i+" "+"of first string is"+":"+str1.charAt(i));

		System.out.println("9.Substring from the index number"+" "+i+" "+"to the end of first string is"+":"+str1.substring(i));
		
		System.out.println("10.Hash value of first string is:"+str1.hashCode());

	}

}


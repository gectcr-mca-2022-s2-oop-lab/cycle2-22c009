package cycle2;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		n = s.nextInt();
		String fruits[] = new String[n];
		System.out.println("Enter the string:");
		Scanner a = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			fruits[i] = a.nextLine();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int compare=fruits[i].compareTo(fruits[j]);
				if (compare<0) {
					String temp = fruits[i];
					fruits[i] = fruits[j];
					fruits[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(fruits));
	}

}

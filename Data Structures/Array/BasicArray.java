import java.util.Scanner;

public class BasicArray {

	public static void main(String[] args) {

		// create simple array

		int[] arr = new int[5];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		// printing using for loop
		// \t means tab
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i]);
		}
		System.out.println();

		// Getting inputs from scanner

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to define size of the array");
		int i = sc.nextInt();

		int[] scannerArr = new int[i];
		System.out.println("Enter the value of the array");

		for (int z = 0; z < scannerArr.length; z++) {
			scannerArr[z] = sc.nextInt();
		}

		for (int p : scannerArr)
			System.out.print("\t" + p);

	}

}

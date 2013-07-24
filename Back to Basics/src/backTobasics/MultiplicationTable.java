package backTobasics;

import java.util.*;

public class MultiplicationTable {

	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] tableValues = new int[4];
		tableValues = getRanges();
		printTable(tableValues);

	}

	public static int[] getRanges() {
		int[] tableValues = new int[4];
		System.out.println("Please enter low column value");
		tableValues[0] = getInt();
		System.out.println("Please enter high column value");
		do {
			tableValues[1] = getInt();
			if (tableValues[1] <= tableValues[0]) {
				System.out.println("Please enter a value larger than "
						+ tableValues[0]);
			}
		} while (tableValues[1] <= tableValues[0]);
		System.out.println("Please enter low row value");
		tableValues[2] = getInt();
		System.out.println("Please enter high row value");
		do {
			tableValues[3] = getInt();
			if (tableValues[3] <= tableValues[2]) {
				System.out.println("Please enter a value larger than "
						+ tableValues[2]);
			}
		} while (tableValues[3] <= tableValues[2]);
		return tableValues;
	}

	public static int getInt() {
		while (!scanner.hasNextInt()) {
			System.out.println("That is not valid. Please enter a number");
			scanner.next();
		}
		return scanner.nextInt();
	}

	public static void printTable(int[] tableValues) {
		System.out.print("*  |\t");
		for (int i = tableValues[0]; i <= tableValues[1]; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.print("   |");
		for (int i = tableValues[0]; i < tableValues[1]; i++) {
			System.out.print("----------");
		}
		System.out.println();
		for (int i = tableValues[2]; i <= tableValues[3]; i++) {
			if (i < 10) {
				System.out.print(i + "  |\t");
			} else if (i < 100) {
				System.out.print(i + " |\t");
			} else {
				System.out.print(i + "|\t");
			}
			for (int j = tableValues[0]; j <= tableValues[1]; j++) {
				System.out.print(j * i + "\t");
			}
			System.out.println();
		}

	}

}

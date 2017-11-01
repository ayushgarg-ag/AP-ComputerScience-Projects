package gradesArray;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double grades[] = new double[10];
		boolean stop = false;
		int count = 0;
		double num;
		
		for (int i = 0; (i < grades.length) && (stop == false); i++) {			
			do {
				System.out.println("Enter test scores");
				try {
					num = reader.nextDouble();
					if (num < 0.0) {
						stop = true;
					}
					else if (num > 100.0) {
						System.out.println("That is out of range!");
					}
				}
				catch (Exception e) {
					String wrong = reader.nextLine();
					System.out.println("You were supposed to enter a number! \nYou entered: " + wrong + "\n" + e);
					num = 101.0;
				}
			} while ((num > 100.0));
			
			if (stop == false) {
				grades[i] = num;
				count++;
			}
		}
		System.out.println(Arrays.toString(grades));
		double [] copy = copier (grades);
		System.out.println("The maximum score is: " + max(copy, count));
		System.out.println("The minimum score is: " + min(copy, count));
		System.out.println("The mean is: " + mean(copy, count));
		System.out.println("The median is: " + median(copy, count));
	}
	
	public static double[] copier (double[] arr) {
		double[] arr2 = Arrays.copyOf (arr, arr.length);
		return arr2;
	}
	
	public static double min (double[] arr, int size) {
		double min = arr[0];
		for (int i = 0; i < size; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static double max (double[] arr, int size) {
		double max = arr[0];
		for (int i = 0; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static double mean (double[] arr, int size) {
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		double mean = sum/(size);
		return mean;
	}
	
	public static double median (double[] arr, int size) {
		Arrays.sort (arr, 0, size);
		double median;
		if (size % 2 == 0) {
			double first = arr[size/2];
			double second = arr[(size/2) - 1];
			median = (first + second) / 2.0;
		}
		else {
			median = arr[size/2];
		}
		return median;
	}
}

package gradesArray;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grades [] = new double[3];
		Scanner reader = new Scanner(System.in);

		for (int i = 0; i < grades.length; i++) {
			System.out.println("Enter a test score  (in decimals from 0.0 to 100.0)");
			double num = reader.nextDouble();
			if (num > 100.0 || num < 0.0) {
				num = reader.nextDouble();
			}
			grades[i] = num;
		}
		System.out.println(Arrays.toString(grades));
		double [] copy = copier (grades);
		
		System.out.println("The maximum score is: " + max(copy));
		System.out.println("The minimum score is: " + min(copy));
		System.out.println("The mean is: " + mean(copy));
		System.out.println("The median is: " + median(copy));
		
	}
	
	public static double[] copier (double[] arr) {
		double[] arr2 = Arrays.copyOf (arr, arr.length);
		return arr2;
	}
	
	public static double min (double[] arr) {
		double min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static double max (double[] arr) {
		double max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static double mean (double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double mean = sum/(arr.length);
		return mean;
	}
	
	public static double median (double[] arr) {
		Arrays.sort (arr);
		double median = arr[1];
		return median;
	}
	

}

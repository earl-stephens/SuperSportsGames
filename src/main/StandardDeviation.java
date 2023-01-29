package main;

import java.text.DecimalFormat;

public class StandardDeviation {
	private int[] ages;
	DecimalFormat df = new DecimalFormat("#.##");

	public StandardDeviation(int[] ages) {
		this.ages = ages;
	}
	
	private int sum() {
		int sum = 0;
		for(int age : ages) {
			sum = sum + age;
		}
		return sum;
	}
	
	private double mean() {
		double mean = 0.00;
		mean = (double)sum() / ages.length;
		return Double.parseDouble(df.format(mean));
	}
	
	private double[] originalsMinusMean() {
		double mean = mean();
		double[] intermediateArray = new double[ages.length];
		for(int i = 0; i < ages.length; i++) {
			intermediateArray[i] = ages[i] - mean;
		}
		return intermediateArray;
	}
	
	private double[] squares() {
		double[] intermediateArray = originalsMinusMean();
		for(int i = 0; i < ages.length; i++) {
			intermediateArray[i] = intermediateArray[i]  * intermediateArray[i];
		}
		return intermediateArray;
	}
	
	private double intermediateSum() {
		double[] arrayToSum = squares();
		double sum = 0.00;
		
		for(double value : arrayToSum) {
			sum = sum + value;
		}
		
		return Double.parseDouble(df.format(sum));
	}
	
	private double intermediateMean() {
		return Double.parseDouble(df.format(intermediateSum() / ages.length));
	}
	
	public double standardDeviation() {
		return Double.parseDouble(df.format(Math.sqrt(intermediateMean())));
	}
}

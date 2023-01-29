package main;

import java.text.DecimalFormat;

public class StandardDeviation {
	int[] ages;
	DecimalFormat df = new DecimalFormat("#.##");

	public StandardDeviation(int[] ages) {
		this.ages = ages;
	}
	
	public int sum() {
		int sum = 0;
		for(int age : ages) {
			sum = sum + age;
		}
		return sum;
	}
	
	public double mean() {
		double mean = 0.00;
		mean = (double)sum() / ages.length;
		return Double.parseDouble(df.format(mean));
	}
	
	public double[] originalsMinusMean() {
		double mean = mean();
		double[] intermediateArray = new double[ages.length];
		for(int i = 0; i < ages.length; i++) {
			intermediateArray[i] = ages[i] - mean;
		}
		return intermediateArray;
	}
	
	public double[] squares() {
		double[] intermediateArray = originalsMinusMean();
		for(int i = 0; i < ages.length; i++) {
			intermediateArray[i] = intermediateArray[i]  * intermediateArray[i];
		}
		return intermediateArray;
	}
	
	public double intermediateSum() {
		double[] arrayToSum = squares();
		double sum = 0.00;
		
		for(double value : arrayToSum) {
			sum = sum + value;
		}
		
		return Double.parseDouble(df.format(sum));
	}
	
	public double intermediateMean() {
		return Double.parseDouble(df.format(intermediateSum() / ages.length));
	}
	
	public double standardDeviation() {
		return Double.parseDouble(df.format(Math.sqrt(intermediateMean())));
	}
}

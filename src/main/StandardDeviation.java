package main;

import java.text.DecimalFormat;

public class StandardDeviation {
	int[] ages;
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
		DecimalFormat df = new DecimalFormat("#.##");
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
}

package main;

import java.text.DecimalFormat;

public class Event {
	private String name;
	private int[] ages;
	
	public Event(String name, int[] ages) {
		this.name = name;
		this.ages = ages;
	}

	public String getName() {
		return name;
	}

	public int[] getAges() {
		return ages;
	}
	
	public int max_age() {
		int maxAge = 0;
		for(int age : ages) {
			if(age > maxAge) {
				maxAge = age;
			}
		}
		return maxAge;
	}
	
	public int min_age() {
		int minAge = 150;
		for(int age : ages) {
			if(minAge > age) {
				minAge = age;
			}
		}
		return minAge;
	}
	
	public double average_age() {
		double sum = 0.0;
		for(int age : ages) {
			sum = sum + age;
		}
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.parseDouble(df.format(sum / ages.length));
	}
	
	public double standard_deviation_age() {
		StandardDeviation sd = new StandardDeviation(ages);
		return sd.standardDeviation();
	}
}

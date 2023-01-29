package main;

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
}

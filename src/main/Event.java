package main;

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
}

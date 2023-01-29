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
}

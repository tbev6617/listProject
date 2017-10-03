package listProject.model;

public class Donut 
{
	private boolean hasSprinkles;
	private boolean isGlazed;
	private String shape;
	private String flavor;
	private int holeCount;
	
	//Initialization with nothing passed in
	public Donut() 
	{
		this.hasSprinkles = false;
		this.isGlazed = false;
		this.shape = "circle";
		this.flavor = "plain";
		this.holeCount = 0;
	}
	//Initialization with changed flavor
	public Donut(String flavor)
	{
		this();
		this.flavor = flavor; 
	}
	//initialization with everything passed in
	public Donut(boolean hasSprinkles, boolean isGlazed, String shape, String flavor, int holeCount)
	{
		this.hasSprinkles = hasSprinkles;
		this.isGlazed = isGlazed;
		this.shape = shape;
		this.flavor = flavor;
		this.holeCount = holeCount;
	}
	public String toString()
	{
		String description = "This donut tastes "+ flavor;
		
		return description;
	}
}

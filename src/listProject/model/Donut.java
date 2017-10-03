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
		hasSprinkles = false;
		isGlazed = true;
		shape = "circle";
		flavor = "tasty";
		holeCount = 1;
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
}

package listProject.controller;

import java.util.List;
import java.util.ArrayList;
//Imported because it's in a different package
import listProject.model.Donut; 
import listProject.view.PopupDisplay;

public class listController 
{
	//make my list
	private List<Donut> donutList;
	private PopupDisplay popup;
	
	public listController()
	{
		//make my list an arrayList
		donutList = new ArrayList<Donut>();
		popup = new PopupDisplay();
	}
	
	public void start() 
	{
		//make a new donut and add it to the list
		Donut plainDonut = new Donut();
		donutList.add(plainDonut);
		fillTheList();
	}
	private void fillTheList()
	{
		//create and adds 4 new donuts
		Donut jellyDonut = new Donut("jelly-filled");
		Donut oldDonut = new Donut("stale");
		Donut glazedDonut = new Donut(false, true, "round", "tasty", 1);
		Donut fancyDonut = new Donut(true, true, "triangle", "fancy", 1);
		donutList.add(jellyDonut);
		donutList.add(oldDonut);
		donutList.add(fancyDonut);
		donutList.add(glazedDonut);
		showTheList();
	}
	
	private void showTheList() 
	{
		for (Donut item : donutList)
		{
			popup.displayText(item.toString());
		}
	}
}

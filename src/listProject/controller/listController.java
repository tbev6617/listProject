package listProject.controller;

import java.util.List;
import java.util.ArrayList;
//Imported because it's in a different package
import listProject.model.Donut; 
import listProject.view.popupDisplay;

public class listController 
{
	//make my list
	private List<Donut> donutList;
	
	public listController()
	{
		//make my list an arrayList
		donutList = new ArrayList<Donut>();
	}
	
	public void start() 
	{
		//make a new donut and add it to the list
		Donut classic = new Donut();
		donutList.add(classic);
	}

}

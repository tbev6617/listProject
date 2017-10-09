package listProject.controller;

import java.util.List;
import java.util.ArrayList;
//Imported because it's in a different package
import listProject.model.Donut; 
import listProject.view.PopupDisplay;

public class ListController 
{
	//make my list
	private List<Donut> donutList;
	private PopupDisplay popup;
	
	public ListController()
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
		Donut fancyDonut = new Donut(true, true, "octagon", "fancy", 1);
		donutList.add(jellyDonut);
		donutList.add(oldDonut);
		donutList.add(fancyDonut);
		donutList.add(glazedDonut);
		donutList.add(new Donut(false, false, "blob", "trashy", 5));
		showTheList();
		changeTheList();
		showTheList();
		addMoreFish();
	}
	
	private void showTheList() 
	{
		String favorite = "jelly-filled";
		for (Donut item : donutList)
		{
//			String santas = "🎅🏼, 🎅🏽, 🎅🏾, 🎅🏿";
//			String currentFlavor = item.getFlavor();
//			
//			if (currentFlavor.equals(favorite))
//			{
//				for (int i = 0; i < 5; i += 1)
//				{
//					popup.displayText(favorite + " is the best flavor ever");
//					System.out.println(santas);
//				}
//			}
//			for (int i = 0; i < currentFlavor.length(); i += 1) 
//			{
//				popup.displayText(currentFlavor.substring(i, i + 1));
//			}
			popup.displayText(item.toString());
		}
	}
	private void changeTheList()
	{
		popup.displayText("The list is " + donutList.size() + " donuts long.");
		Donut removed = donutList.remove(0);
		popup.displayText(removed.getFlavor() + " was removed from the list.");
		popup.displayText("Now the list is only " + donutList.size() + " donuts long.");
		
		popup.displayText("The list still contains " + donutList.size()  + " items");
		removed = donutList.set(3, new Donut());
		popup.displayText("The " + removed.getFlavor() + " donut is now plain");
	}
	public void addMoreFish()
	{
		popup.displayText("Sea creatures deserve to be donuts too");
		Donut fishDonut = new Donut("fishy");
		Donut krabbyPattyDonut = new Donut("like a Krabby Patty");
		donutList.add(fishDonut);
		donutList.add(new Donut("salty"));
		donutList.add(2, krabbyPattyDonut);
		donutList.add(new Donut("barnacle-like"));
		showTheListBackwards();
		popup.displayText("The jelly-filled donut is now a jellyfish donut");
		donutList.set(0, new Donut("jellyfishy"));
		showTheList();
	}
	public void showTheListBackwards()
	{
		popup.displayText("The list size is " + donutList.size());
		for (int i = donutList.size() - 1; i >= 0; i = i - 1)
		{
			Donut currentDonut = donutList.get(i);
			popup.displayText(currentDonut.toString());
		}
	}
	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	public PopupDisplay getDisplay()
	{
		return popup;
	}
}

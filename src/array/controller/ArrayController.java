package array.controller;

import array.view.ArrayView;

public class ArrayController 
{
	//Declaration Section: declares what will be used in the program
	private String [][] friendNames;
	private int [][] myFamilyAges;
	private ArrayView consoleView;
	
	//Constructor: makes objects and assigns values
	public ArrayController()
	{
		myFamilyAges = new int [3][3];
		friendNames = new String [4][4];
		consoleView = new ArrayView();
		
	}
	
	public int[][]getMyFamilyAges()
	{
		return myFamilyAges;
	}
	public void setMyFamilyAges(int[][] myFamilyAges)
	{
		this.myFamilyAges = myFamilyAges;
	}
	public String[][] getFriendNames()
	{
		return friendNames;
	}
	public void setFriendNames(String[][] friendNames)
	{
		this.friendNames = friendNames;
	}
	private void fillAges()
	{
		myFamilyAges[0][0] = 11;
		myFamilyAges[0][1] = 54;
		myFamilyAges[0][2] = 49;
		
		myFamilyAges[1][0] = 2;
		myFamilyAges[1][1] = 11;
		myFamilyAges[1][2] = 9;
		
		myFamilyAges[2][0] = 13;
		myFamilyAges[2][1] = 20;
		myFamilyAges[2][2] = 22;
	}
	private void fillNames()
	{
		friendNames[0][0] = "CJ";
		friendNames[0][1] = "Jaren";
		friendNames[0][2] = "Noelle";
		friendNames[0][3] = "Maddy";
		
		friendNames[1][0] = "";
		friendNames[1][1] = "Jaren";
		friendNames[1][2] = "Noelle";
		friendNames[1][3] = "Maddy";
		
		friendNames[2][0] = "CJ";
		friendNames[2][1] = "Jaren";
		friendNames[2][2] = "Noelle";
		friendNames[2][3] = "Maddy";
		
		friendNames[3][0] = "CJ";
		friendNames[3][1] = "Jaren";
		friendNames[3][2] = "Noelle";
		friendNames[3][3] = "Maddy";
	}
	public void start()
	{
		fillAges();
		consoleView.printIntInformation(myFamilyAges);
	}
	
	
}

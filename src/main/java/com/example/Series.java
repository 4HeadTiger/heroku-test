package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Series 
{

	/**
	 * The list of all series loaded into the app
	 */
	public static List<Series> SeriesList = new ArrayList<Series>();
	
	/**
	 * A map containing all loaded genres for simplification etc later
	 */
	public static Map<String, Integer> genreMap = new HashMap<String, Integer>();
	
	
	/////////////////////////////////////////////////////////
	//////////////////////// SERIES /////////////////////////
	/////////////////////////////////////////////////////////
	
	/** The title of the series */	public String title;
	/** The series' description */ 	public String desc;
	/** The rating of the series*/	public String rating;
	/** The author of the series*/	public String author;
	/** Series completion status*/	public boolean completed;
	/** Chapter count of series */	public int chapters;
	/** Date of latest update	*/ 	public Date lastUpdated;
	/** List of genres  */ 			public List<String> genres = new ArrayList<String>();
	
	
	
	
}

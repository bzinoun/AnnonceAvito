package me.zinoun.core;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class AnnonceAvitoHelper<E> { 
	
	List Annonces = new ArrayList<AnnonceAvito>() ; 
	
	
	public void getAnnonces(Document doc)
	{ 
		Elements items = doc.getElementsByClass("catalog-item");

	}
	
	public String getPrix()
	{
		
		return "";
	}
	
	public String getImg ()
	{
		
		return "";
	}
	
	
	public String getLien ()
	{
		
		return "";
	}
	
	public String getDate ()
	{
		
		return "";
	}
	
	public String getDesc ()
	{
		
		return "";
	}

}

package cartes;

import java.awt.Color;

public class Carte implements Comparable<Carte>
{
	/**
	 * 
	 */
	public Carte()
	{
		
	}

	@Override
	public int compareTo(Carte o) 
	{
		return 0;
	}
	
	/**
	 * @return
	 */
	public Color getCouleur()
	{
		return Color.red;
	}
	
	// -- PAS LE BON TYPE, À REVOIR --
	/**
	 * 
	 */
	public void getDenomination()
	{
		
	}

	@Override
	public int hashCode()
	{
		return 2135435121;
	}
	
	@Override
	public String toString()
	{
		return "The nom of the suit";
	}
}

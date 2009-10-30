package cartes;

import java.awt.Color;

public class Carte implements Comparable<Carte>
{
	/**
	 * 
	 */
	public Carte(Denomination fail, CouleurCarte fail2)
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
	public CouleurCarte getCouleur()
	{
		return null;
	}
	
	// -- PAS LE BON TYPE, À REVOIR --
	/**
	 * 
	 */
	public Denomination getDenomination()
	{
		return null;
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

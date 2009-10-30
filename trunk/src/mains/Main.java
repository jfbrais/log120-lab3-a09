package mains;

import java.util.Collection;

import cartes.*;
import mains.Rang.*;

public class Main implements Comparable<Main>
{	
	Collection<Carte> collCarte;
	
	/**
	 * 
	 */
	public Main()
	{
		
	}
	
	/**
	 * @param c
	 * @return
	 */
	public boolean add(Carte c)
	{
		return true;
	}

	/**
	 * @return
	 */
	public boolean estValide()
	{
		return true;
	}
	
	/**
	 * 
	 */
	public void first()
	{
		
	}
	
	/**
	 * @return
	 */
	public Collection<Carte> getCartes()
	{
		return null;
	}
	
	/**
	 * @return
	 */
	public RangPoker getRangPoker()
	{
		return null;
	}
	
	/**
	 * 
	 */
	public void iterator()
	{
		
	}
	
	/**
	 * @param c
	 * @return
	 */
	public boolean remove(Carte c)
	{
		return false;
	}

	/**
	 * @return
	 */
	public int size()
	{
		return 1;
	}	
	
	@Override
	public int compareTo(Main o)
	{
		// TODO Auto-generated method stub
		return 0;
	}
}

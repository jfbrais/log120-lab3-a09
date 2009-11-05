package mains;

import java.util.ArrayList;
import java.util.Collection;

import cartes.*;
import mains.Rang.*;

public class Main implements Comparable<Main>
{
	ArrayList<Carte> collCarte = new ArrayList<Carte>();

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
		if (collCarte.size() < 5)
		{
			collCarte.add(c);
			return true;
		}
		return false;
	}

	/**
	 * @return
	 */
	public boolean estValide()
	{
		if (collCarte.size() == 5)
		{
			return true;
		}
		return false;
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
	public ArrayList<Carte> getCartes()
	{
		return collCarte;
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

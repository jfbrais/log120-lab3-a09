package mains;

import java.util.ArrayList;
import java.util.Iterator;

import cartes.*;
import mains.Rang.*;

public class Main implements Comparable<Main>, Iterable<Carte>
{
	ArrayList<Carte> collCarte = new ArrayList<Carte>();
	RangPoker rang;

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
		if (collCarte.size() == 0)
		{
			collCarte.add(c);
			return true;
		}
		else if (collCarte.size() < 5)
		{
			for (int j = 0; j < collCarte.size(); j++)
			{
				if (collCarte.get(j).getDenomination().compareTo(
						c.getDenomination()) < 0)
				{
					collCarte.add(j, c);
					return true;
				}
			}
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
	public Carte first()
	{
		return collCarte.get(0);
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
		ReqAnalyseMain analyseur = new ReqAnalyseMain(this);
		AbstractAnalyseurRang first = new QuinteRoyale();
		first	.setSuivant(new Quintuplet()
				.setSuivant(new QuinteCouleur()
				.setSuivant(new Carre()
				.setSuivant(new MainPleine()
				.setSuivant(new Couleur()
				.setSuivant(new Quinte()
				.setSuivant(new Brelan()
				.setSuivant(new DeuxPaires()
				.setSuivant(new Paire()
				.setSuivant(new CarteSuperieure()))))))))));
		
		first.traiterDemande(analyseur);
		return analyseur.getRangReconnu();
	}

	/**
	 * 
	 */
	public Iterator<Carte> iterator()
	{
		return collCarte.iterator();
	}

	/**
	 * @param c
	 * @return
	 */
	public boolean remove(Carte c)
	{
		for (int i = 0; i < collCarte.size(); i++)
		{
			if (collCarte.get(i).equals(c))
			{
				collCarte.remove(i);
				return true;
			}
		}
		return false;
	}

	/**
	 * @return
	 */
	public int size()
	{
		return collCarte.size();
	}

	@Override
	public int compareTo(Main o)
	{
		rang = this.getRangPoker();
		return rang.compareTo(o.getRangPoker());
	}
}

package mains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import cartes.*;
import mains.Rang.*;

public class RangPoker implements Comparable<RangPoker>
{
	Denomination denom = null;
	Denomination denom2 = null;
	Denomination kicker = null;
	AbstractAnalyseurRang rang;

	public static final List RANGS = Collections.unmodifiableList(Arrays
			.asList(new AbstractAnalyseurRang[]
			{ new CarteSuperieure(), new Paire(), new DeuxPaires(),
					new Brelan(), new Quinte(), new Couleur(),
					new MainPleine(), new Carre(), new QuinteCouleur(),
					new Quintuplet(), new QuinteRoyale() }));

	public RangPoker(AbstractAnalyseurRang rang, Denomination denom)
	{
		this.rang = rang;
		this.denom = denom;
	}

	@Override
	public int compareTo(RangPoker o)
	{
		if (RANGS.indexOf(rang) > RANGS.indexOf(o.getRang()))
			return 1;
		else if (RANGS.indexOf(rang) < RANGS.indexOf(o.getRang()))
			return -1;
		else
		{
			if (Denomination.DENOMINATIONS.indexOf(denom) > Denomination.DENOMINATIONS.indexOf(o.getDenom()))
				return 1;
			else if (Denomination.DENOMINATIONS.indexOf(denom) < Denomination.DENOMINATIONS.indexOf(o.getDenom()))
				return -1;
			else if (RANGS.indexOf(rang) == 2 || RANGS.indexOf(rang) == 3)
				if (Denomination.DENOMINATIONS.indexOf(denom2) > Denomination.DENOMINATIONS.indexOf(o.getDenom2()))
					return 1;
				else if (Denomination.DENOMINATIONS.indexOf(denom2) < Denomination.DENOMINATIONS.indexOf(o.getDenom2()))
					return -1;
				else
					;
			
			if (Denomination.DENOMINATIONS.indexOf(kicker) > Denomination.DENOMINATIONS.indexOf(o.getKicker()))
				return 1;
			else if (Denomination.DENOMINATIONS.indexOf(kicker) < Denomination.DENOMINATIONS.indexOf(o.getKicker()))
				return -1; 
			else 
			{
				if (RANGS.indexOf(rang) == 5)
				{
					//check chaque carte ?
				}
				else
					;
				return 0;
			}
		}
	}

	public AbstractAnalyseurRang getRang()
	{
		return rang;
	}
	
	public Denomination getDenom()
	{
		return denom;
	}
	
	public void deuxiemePaire(Denomination denom)
	{
		denom2 = denom;
	}
	
	public Denomination getDenom2()
	{
		return denom2;
	}
	
	public void setKicker(Denomination kicker)
	{
		this.kicker = kicker;
	}
	
	public Denomination getKicker()
	{
		return kicker;
	}
}

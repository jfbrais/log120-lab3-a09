package mains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import cartes.*;
import mains.Rang.*;

public class RangPoker implements Comparable<RangPoker>
{
	Denomination denom;
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
			else
				return 0;
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
}

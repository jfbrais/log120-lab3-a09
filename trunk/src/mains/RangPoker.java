/******************************************************
 Cours :             LOG120
 Session :           Saison automne 2009
 Groupe :            03
 Projet :            Laboratoire #3
 Étudiant(e)(s) :    Gabriel Desmarais
 					 Jean-François Brais-Villemur
 Code(s) perm. :     DESG24078908
 					 BRAJ14088901
 Professeur :        Jocelyn Benoît
 Chargé de labo.:    Vincent Carrier
 					 Yanick Rochon
 Nom du fichier :	 RangPoker.java 					 
 Date créée :        2009-11-10
 Date dern. modif. : 2009-11-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-11-10 : Status Initial
 *******************************************************/

package mains;

import cartes.*;
import mains.Rang.*;

/**
 * Contient les inforamations pour déterminer le rang d'un paquet de carte.
 * @author Gab
 *
 */
public class RangPoker implements Comparable<RangPoker>
{
	private Denomination[] couleur = null;
	private Denomination denom = null;
	private Denomination denom2 = null;
	private Denomination kicker = null;
	private int rang;

	/**
	 * Constructeur se voyant attribuer un rang et une dénomination.
	 * @param rang
	 * @param denom
	 */
	public RangPoker(AbstractAnalyseurRang rang, Denomination denom)
	{
		this.denom = denom;
		
		if (rang instanceof CarteSuperieure)
			this.rang = 0;
		if (rang instanceof Paire)
			this.rang = 1;
		if (rang instanceof DeuxPaires)
			this.rang = 2;
		if (rang instanceof Brelan)
			this.rang = 3;
		if (rang instanceof Quinte)
			this.rang = 4;
		if (rang instanceof Couleur)
			this.rang = 5;
		if (rang instanceof MainPleine)
			this.rang = 6;
		if (rang instanceof Carre)
			this.rang = 7;
		if (rang instanceof QuinteCouleur)
			this.rang = 8;
		if (rang instanceof Quintuplet)
			this.rang = 9;
		if (rang instanceof QuinteRoyale)
			this.rang = 10;		
	}

	@Override
	public int compareTo(RangPoker o)
	{
		if (rang > o.getRang())
			return 1;
		else if (rang < o.getRang())
			return -1;
		else
		{
			if (Denomination.DENOMINATIONS.indexOf(denom) > Denomination.DENOMINATIONS.indexOf(o.getDenom()))
				return 1;
			else if (Denomination.DENOMINATIONS.indexOf(denom) < Denomination.DENOMINATIONS.indexOf(o.getDenom()))
				return -1;
			else if (rang == 2 || rang == 3 || rang == 6)
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
				if (rang == 5)
				{
					Denomination[] couleur2 = o.getCouleur();
					for (int i=0;i<couleur.length;i++)
					{
						if (Denomination.DENOMINATIONS.indexOf(couleur[i]) > Denomination.DENOMINATIONS.indexOf(couleur2[i]))
							return 1;
						else if (Denomination.DENOMINATIONS.indexOf(couleur[i]) < Denomination.DENOMINATIONS.indexOf(couleur2[i]))
							return -1;
					}
				}
				else
					;
				return 0;
			}
		}
	}

	/**
	 * Retourne le rang.
	 * @return rang
	 */
	public int getRang()
	{
		return rang;
	}
	
	/**
	 * Retourne la première dénomination.
	 * @return denom
	 */
	public Denomination getDenom()
	{
		return denom;
	}
	
	/**
	 * Configure la deuxième dénomination.
	 * @param denom
	 */
	public void deuxiemePaire(Denomination denom)
	{
		denom2 = denom;
		System.out.println(Denomination.DENOMINATIONS.indexOf(denom2));
	}
	
	/**
	 * Retourne la deuxième dénomination.
	 * @return denom2
	 */
	public Denomination getDenom2()
	{
		return denom2;
	}
	
	/**
	 * Configure le kicker.
	 * @param kicker
	 */
	public void setKicker(Denomination kicker)
	{
		this.kicker = kicker;
	}
	
	/**
	 * Retourne le kicker.
	 * @return kicker
	 */
	public Denomination getKicker()
	{
		return kicker;
	}
	
	/**
	 * Configure la liste des cartes d'une couleur.
	 * @param couleur
	 */
	public void setCouleur(Denomination[] couleur)
	{
		this.couleur = couleur;
	}
	
	/**
	 * Retourne la liste des cartes d'une couleur.
	 * @return couleur
	 */
	public Denomination[] getCouleur()
	{
		return couleur;
	}
	
	@Override
	public int hashCode()
	{
		int i=1;
		int hash=0;
		
		for (int j=0;j<couleur.length;j++)
		{
			hash+=i*Denomination.DENOMINATIONS.indexOf(couleur[j]);
			i*=10;
		}
		
		if (denom!=null)
		{
			hash+=i*Denomination.DENOMINATIONS.indexOf(denom);
			i*=10;
		}
		
		if (denom2!=null)
		{
			hash+=i*Denomination.DENOMINATIONS.indexOf(denom2);
			i*=10;
		}
		
		if (kicker!=null)
		{
			hash+=i*Denomination.DENOMINATIONS.indexOf(kicker);
			i*=10;
		}
		
		hash+=i*rang;
		
		return hash;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Carte)
			if (this.hashCode()==obj.hashCode())
				return true;
		return false;
	}
}

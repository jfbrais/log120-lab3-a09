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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import cartes.*;
import mains.Rang.*;

/**
 * Contient les inforamations pour déterminer le rang d'un paquet de carte.
 * @author Gab
 *
 */
public class RangPoker implements Comparable<RangPoker>
{
	Denomination[] couleur = null;
	Denomination denom = null;
	Denomination denom2 = null;
	Denomination kicker = null;
	AbstractAnalyseurRang rang;

	public static final List<AbstractAnalyseurRang> RANGS = Collections.unmodifiableList(Arrays
			.asList(new AbstractAnalyseurRang[]
			{ new CarteSuperieure(), new Paire(), new DeuxPaires(),
					new Brelan(), new Quinte(), new Couleur(),
					new MainPleine(), new Carre(), new QuinteCouleur(),
					new Quintuplet(), new QuinteRoyale() }));

	/**
	 * Constructeur se voyant attribuer un rang et une dénomination.
	 * @param rang
	 * @param denom
	 */
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
	public AbstractAnalyseurRang getRang()
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
}

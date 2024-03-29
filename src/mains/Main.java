/******************************************************
 Cours :             LOG120
 Session :           Saison automne 2009
 Groupe :            03
 Projet :            Laboratoire #3
 �tudiant(e)(s) :    Gabriel Desmarais
 					 Jean-Fran�ois Brais-Villemur
 Code(s) perm. :     DESG24078908
 					 BRAJ14088901
 Professeur :        Jocelyn Beno�t
 Charg� de labo.:    Vincent Carrier
 					 Yanick Rochon
 Nom du fichier :	 Main.java 					 
 Date cr��e :        2009-11-10
 Date dern. modif. : 2009-11-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-11-10 : Status Initial
 *******************************************************/

package mains;

import java.util.ArrayList;
import java.util.Iterator;

import cartes.*;
import mains.Rang.*;

/**
 * Classe poss�dant les cartes et les encapsule comme un tout.
 * @author Gab
 *
 */
public class Main implements Comparable<Main>, Iterable<Carte>
{
	ArrayList<Carte> collCarte = new ArrayList<Carte>();
	RangPoker rang;

	/**
	 * Ajoute une carte et retourne s'il a r�ussi � ajouter la carte.
	 * @param c
	 * @return boolean
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
	 * Regarde s'il y a 5 cartes dans la main.
	 * @return boolean
	 */
	public boolean estValide()
	{
		if (size() == 5)
		{
			return true;
		}
		return false;
	}

	/**
	 * Retourne la premi�re carte de la main, ce qui est la plus haute.
	 */
	public Carte first()
	{
		return collCarte.get(0);
	}

	/**
	 * Retourne toutes les cartes que la main poss�de.
	 * @return collCarte
	 */
	public ArrayList<Carte> getCartes()
	{
		return collCarte;
	}

	/**
	 * Analyse la main et retourne le rang associ� � la main.
	 * @return RangPoker
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

	public Iterator<Carte> iterator()
	{
		return collCarte.iterator();
	}

	/**
	 * Supprime une carte et retourne s'il a r�ussi � supprimer la carte.
	 * Utiliser l'it�rateur de la classe Main.
	 * @param c
	 * @return boolean
	 */
	public boolean remove(Carte c)
	{
		Iterator<Carte> iter = this.iterator();
		while (iter.hasNext())
		{
			if (iter.next().equals(c))
			{
				iter.remove();
				return true;
			}
		}
		
		return false;
	}

	/**
	 * Retourne le nombre de carte contenu dans la main.
	 * @return size
	 */
	public int size()
	{
		return collCarte.size();
	}

	/** 
	 * Retourne 0 si les deux mains sont �gales ou non valide, si une main n'est pas valide, retourne
	 * l'autre main et si les deux main sont valide, suit le compareTo de la classe Object.
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * @param main
	 * @return int
	 */
	@Override
	public int compareTo(Main o)
	{
		if (!this.estValide() && !o.estValide())
			return 0;
		
		if (!this.estValide())
			return -1;
		
		if (!o.estValide())
			return 1;
		
		if (this.estValide() && o.estValide())
		{
			rang = this.getRangPoker();
			RangPoker rangCompare = o.getRangPoker();
			int result = rang.compareTo(rangCompare);
			return result;
		}
		
		return 0;
	}
	
	@Override
	public int hashCode()
	{
		return 
		 collCarte.get(0).hashCode()*10000
		+collCarte.get(1).hashCode()*1000
		+collCarte.get(2).hashCode()*100
		+collCarte.get(3).hashCode()*10
		+collCarte.get(4).hashCode()*1;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Carte)
			if (this.hashCode()==obj.hashCode())
				return true;
		return false;
	}
}

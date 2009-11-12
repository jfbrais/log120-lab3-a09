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
 Nom du fichier :	 Carte.java 					 
 Date cr��e :        2009-11-10
 Date dern. modif. : 2009-11-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-11-10 : Status Initial
 *******************************************************/

package cartes;

/**
 * D�finit ce qu'une carte poss�de.
 * @author Gab
 *
 */
public class Carte implements Comparable<Carte>
{
	private Denomination denom;
	private CouleurCarte couleur;

	/**
	 * Constructeur de carte.
	 * @param newDenom
	 * @param newCouleur
	 */
	public Carte(Denomination newDenom, CouleurCarte newCouleur)
	{
		denom = newDenom;
		couleur = newCouleur;
	}

	@Override
	public int compareTo(Carte o)
	{
		if (o == null)
			throw new NullPointerException();

		return (this.getDenomination().compareTo(o.getDenomination()));
	}

	/**
	 * Cherche la couleur de la carte.
	 * @return couleur
	 */
	public CouleurCarte getCouleur()
	{
		return couleur;
	}

	/**
	 * Cherche la D�nomination de la carte.
	 * @return denom
	 */
	public Denomination getDenomination()
	{
		return denom;
	}

	@Override
	public int hashCode()
	{
		return CouleurCarte.COULEURS.indexOf(couleur)*100+Denomination.DENOMINATIONS.indexOf(denom);
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Carte)
			if (this.hashCode()==obj.hashCode())
				return true;
		return false;
	}

	@Override
	public String toString()
	{
		return denom.getNom() + " de " + couleur.getNom();
	}
}

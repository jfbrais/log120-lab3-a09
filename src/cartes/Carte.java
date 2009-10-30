package cartes;

public class Carte implements Comparable<Carte>
{
	Denomination denom;
	CouleurCarte couleur;

	/**
	 * 
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

		return (this.getDenomination().caractereSurCarte().compareTo(o.getDenomination().caractereSurCarte()));
	}

	/**
	 * @return
	 */
	public CouleurCarte getCouleur()
	{
		return couleur;
	}

	/**
	 * 
	 */
	public Denomination getDenomination()
	{
		return denom;
	}

	@Override
	public int hashCode()
	{
		return CouleurCarte.COULEURS.indexOf(couleur)*1000+Denomination.DENOMINATIONS.indexOf(denom);
	}

	@Override
	public String toString()
	{
		return denom.getNom() + " de " + couleur.getNom();
	}
}

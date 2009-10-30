/*
 * Created on Jun 12, 2005
 *
 */
package cartes;

import java.util.Comparator;

/**
 * Classe pour inverser l'ordre de tri de nos cartes.
 * Normalement elles seront triee en ordre croissante (naturelle).
 *
 * @author Cris Fuhrman
 *
 */
public class ComparateurCartesInverse implements Comparator
{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Object arg0, Object arg1)
	{
		// inverser l'ordre des cartes dans une liste (plut�t que arg0.compareTo(arg1))
		return ((Carte) arg1).compareTo((Carte) arg0);
	}

}

/*
 * Created on Dec 16, 2004
 *
 */
package mains;

import cartes.Carte;
import cartes.CouleurCarte;
import cartes.Denomination;
import mains.Rang.*;
import junit.framework.TestCase;

/**
 * Ensemble de tests unitaires pour tester l'analyse d'une main qui est une couleur (Flush) de Poker
 * 
 * @author Cris Fuhrman
 */
public class CouleurTest extends TestCase
{
	public void test…valueMain()
	{
		/*
		 * Test avec main qui n'est pas une couleur
		 */
		Main main = new Main();
		main.add(new Carte(Denomination.TROIS, CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.NEUF, CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.AS, CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DAME, CouleurCarte.COEUR));
		main.add(new Carte(Denomination.DEUX, CouleurCarte.COEUR));
		
		assertFalse(new Couleur().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est une couleur
		 */
		main = new Main();
		main.add(new Carte(Denomination.TROIS, CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.NEUF, CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.AS, CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.DAME, CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.DEUX, CouleurCarte.CARREAU));
		
		assertTrue(new Couleur().reconnaitreMain(new ReqAnalyseMain(main)));

	}
}

///

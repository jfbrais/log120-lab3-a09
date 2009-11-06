/*
 * Created on Dec 16, 2004
 *
 */
package mains.Rang;

import junit.framework.TestCase;
import cartes.*;
import mains.Main;
import mains.ReqAnalyseMain;
import mains.Rang.*;

/**
 * Ensemble de tests unitaires pour tester l'analyse d'une main qui est une quinte de Poker
 * 
 * @author Cris Fuhrman
 */
public class MainPleineTest extends TestCase
{
	public void testÉvalueMain()
	{
		/*
		 * Test avec main qui n'est pas une main pleine.
		 */
		Main main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		assertFalse(new MainPleine().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est un brelan bas
		 */
		main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.COEUR));
		
		assertTrue(new MainPleine().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est un brelan élevé
		 */
		main = new Main();
		main.add(new Carte(Denomination.ROI, cartes.CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.ROI, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.ROI, cartes.CouleurCarte.CARREAU));
		
		assertTrue(new MainPleine().reconnaitreMain(new ReqAnalyseMain(main)));

	}
}

///


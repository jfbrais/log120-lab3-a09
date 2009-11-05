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
public class QuinteRoyaleTest extends TestCase
{
	public void test…valueMain()
	{
		/*
		 * Test avec main qui n'est pas une quinte royale.
		 */
		Main main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		assertFalse(new QuinteRoyale().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est une quinte royale.
		 */
		main = new Main();
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.ROI, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DAME, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.VALET, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DIX, cartes.CouleurCarte.TREFLE));
		
		assertTrue(new QuinteRoyale().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est une quinte royale.
		 */
		main = new Main();
		main.add(new Carte(Denomination.DIX, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.DAME, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.ROI, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.VALET, cartes.CouleurCarte.CARREAU));
		
		assertTrue(new QuinteRoyale().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est une quinte royale.
		 */
		main = new Main();
		main.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		
		assertFalse(new QuinteRoyale().reconnaitreMain(new ReqAnalyseMain(main)));
	}
}

///


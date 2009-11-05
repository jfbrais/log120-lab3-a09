/*
 * Created on Dec 16, 2004
 *
 */
package mains;

import junit.framework.TestCase;
import cartes.*;
import mains.Rang.*;

/**
 * Ensemble de tests unitaires pour tester l'analyse d'une main qui est une quinte de Poker
 * 
 * @author Cris Fuhrman
 */
public class PaireTest extends TestCase
{
	public void test…valueMain()
	{
		/*
		 * Test avec main qui n'est pas une paire
		 */
		Main main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		assertFalse(new Paire().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est une paire basse
		 */
		main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.COEUR));
		
		assertTrue(new Paire().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est une paire haute
		 */
		main = new Main();
		main.add(new Carte(Denomination.ROI, cartes.CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.ROI, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.CARREAU));
		
		assertTrue(new Paire().reconnaitreMain(new ReqAnalyseMain(main)));

	}
}

///

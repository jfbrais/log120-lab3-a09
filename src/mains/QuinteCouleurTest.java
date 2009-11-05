/*
 * Created on Dec 16, 2004
 *
 */
package mains;

import cartes.Carte;
import cartes.Denomination;
import mains.Rang.*;

/**
 * Ensemble de tests unitaires pour tester l'analyse d'une main qui est une quinte couleur (Straight Flush) de Poker
 * 
 * @author Cris
 */
public class QuinteCouleurTest extends AbstractAnalyseurRangTest
{

	/**
	 * @param arg0
	 */
	public QuinteCouleurTest(String arg0)
	{
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public void test…valueMain()
	{
		/*
		 * Test avec main qui n'est pas une quinte couleur
		 */
		Main main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		assertFalse(new QuinteCouleur().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui n'est pas une quinte couleur
		 */
		main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		
		assertFalse(new QuinteCouleur().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est une quinte couleur avec AS
		 */
		main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		
		assertTrue(new QuinteCouleur().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est une quinte couleur sans AS
		 */
		main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.SIX, cartes.CouleurCarte.COEUR));

		assertTrue(new QuinteCouleur().reconnaitreMain(new ReqAnalyseMain(main)));

	}
}

///

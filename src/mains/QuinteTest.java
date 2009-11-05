/*
 * Created on Dec 16, 2004
 *
 */
package mains;

import cartes.Carte;
import cartes.Denomination;
import mains.Rang.*;

/**
 * Ensemble de tests unitaires pour tester l'analyse d'une main qui est une quinte de Poker
 * 
 * @author Cris Fuhrman
 */
public class QuinteTest extends AbstractAnalyseurRangTest
{

	/**
	 * @param arg0
	 */
	public QuinteTest(String arg0)
	{
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public void testÉvalueMain()
	{
		/*
		 * Test avec main qui n'est pas une quinte
		 */
		Main main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		assertFalse(new Quinte().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est une quinte avec AS
		 */
		main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		
		assertTrue(new Quinte().reconnaitreMain(new ReqAnalyseMain(main)));

		/*
		 * Test avec main qui est une quinte sans AS
		 */
		main = new Main();
		main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.PIQUE));
		main.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.CARREAU));
		main.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.TREFLE));
		main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		main.add(new Carte(Denomination.SIX, cartes.CouleurCarte.CARREAU));
		
		assertTrue(new Quinte().reconnaitreMain(new ReqAnalyseMain(main)));

	}
}

///

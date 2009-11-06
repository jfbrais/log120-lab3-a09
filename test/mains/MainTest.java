package mains;

import java.util.ArrayList;

import cartes.Carte;
import cartes.Denomination;
import junit.framework.TestCase;

public class MainTest extends TestCase
{
	public void test…valueMain()
	{
		/*
		 * Test avec main qui n'est pas une quinte
		 */
		Main main = new Main();
		assertTrue(main.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.CARREAU)));
		assertTrue(main.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.PIQUE)));
		assertTrue(main.add(new Carte(Denomination.AS, cartes.CouleurCarte.TREFLE)));
		assertTrue(main.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR)));
		assertTrue(main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR)));
	}
}

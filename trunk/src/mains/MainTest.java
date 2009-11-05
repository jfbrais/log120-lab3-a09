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
		voirCarte(main);
		assertTrue(main.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.PIQUE)));
		voirCarte(main);
		assertTrue(main.add(new Carte(Denomination.AS, cartes.CouleurCarte.TREFLE)));
		voirCarte(main);
		assertTrue(main.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR)));
		voirCarte(main);
		assertTrue(main.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR)));
		voirCarte(main);
	}
	
	private void voirCarte(Main main)
	{
		ArrayList<Carte> collCarte = new ArrayList<Carte>();
		collCarte = main.getCartes();
		System.out.println();
		for (int i=0;i<collCarte.size();i++)
		{
			System.out.println(collCarte.get(i));
		}
	}
}

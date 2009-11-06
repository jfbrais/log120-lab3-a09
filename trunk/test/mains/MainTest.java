package mains;

import java.util.ArrayList;

import cartes.Carte;
import cartes.Denomination;
import junit.framework.TestCase;

public class MainTest extends TestCase
{
	public void testÉvalueMain()
	{
		// -- TEST CARTE SUPÉRIEURE --
		// main1 a une carte supérieure à main2
		Main main1 = new Main();
		main1.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		
		Main main2 = new Main();
		main2.add(new Carte(Denomination.ROI, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) > 0);
		
		// main1 a une carte inférieure à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.ROI, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) < 0);
		
		// main1 a une carte égale à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.ROI, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.ROI, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) == 0);
		
		// -- TEST PAIRE --
		// main1 a une paire supérieure à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.AS, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) > 0);
		
		// main1 a une paire inférieure à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.ROI, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.ROI, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) < 0);
		
		// main1 a une paire égale à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.ROI, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) == 0);
		
		// -- TEST DEUX PAIRES --
		// main1 a deux paires supérieures à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.ROI, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.ROI, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.DAME, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) > 0);
		
		// main1 a sa paire supérieure qui est égale à celle de main2
//		main1 = new Main();
//		main1.add(new Carte(Denomination.ROI, cartes.CouleurCarte.CARREAU));
//		main1.add(new Carte(Denomination.ROI, cartes.CouleurCarte.PIQUE));
//		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.TREFLE));
//		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.COEUR));
//		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
//		
//		main2 = new Main();
//		main2.add(new Carte(Denomination.ROI, cartes.CouleurCarte.CARREAU));
//		main2.add(new Carte(Denomination.ROI, cartes.CouleurCarte.PIQUE));
//		main2.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
//		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
//		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
//		
//		assertTrue(main1.compareTo(main2) > 0);
		
		// main1 a deux paires inférieures à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.ROI, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.ROI, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) < 0);
		
		// main1 a deux paires égalent à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.DIX, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.DIX, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.DIX, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.DIX, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) == 0);
		
		// main1 a deux paires égalent à main2, mais main2 a une cinquième carte plus élevée
//		main1 = new Main();
//		main1.add(new Carte(Denomination.DIX, cartes.CouleurCarte.CARREAU));
//		main1.add(new Carte(Denomination.DIX, cartes.CouleurCarte.PIQUE));
//		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.TREFLE));
//		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.COEUR));
//		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
//		
//		main2 = new Main();
//		main2.add(new Carte(Denomination.DIX, cartes.CouleurCarte.CARREAU));
//		main2.add(new Carte(Denomination.DIX, cartes.CouleurCarte.PIQUE));
//		main2.add(new Carte(Denomination.ROI, cartes.CouleurCarte.TREFLE));
//		main2.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
//		main2.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
//		
//		assertTrue(main1.compareTo(main2) < 0);
		
		// -- TEST BRELAN --
		// main1 a un brelan supérieur à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) > 0);
		
		// main1 a un brelan inférieur à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.AS, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.AS, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) < 0);
		
		// main1 a un brelan égale à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.AS, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.AS, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.DAME, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.AS, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.AS, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) == 0);
		
		// -- TEST QUINTE --
		// main1 a une quinte supérieure à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.DIX, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.SIX, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) > 0);
		
		// main1 a une quinte inférieure à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.SIX, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.DIX, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.SIX, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.SEPT, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.HUIT, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.NEUF, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) < 0);
		
		// main1 a une quinte égale à main2
		main1 = new Main();
		main1.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		main1.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.PIQUE));
		main1.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.TREFLE));
		main1.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.COEUR));
		main1.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.COEUR));
		
		main2 = new Main();
		main2.add(new Carte(Denomination.AS, cartes.CouleurCarte.CARREAU));
		main2.add(new Carte(Denomination.CINQ, cartes.CouleurCarte.PIQUE));
		main2.add(new Carte(Denomination.QUATRE, cartes.CouleurCarte.TREFLE));
		main2.add(new Carte(Denomination.TROIS, cartes.CouleurCarte.COEUR));
		main2.add(new Carte(Denomination.DEUX, cartes.CouleurCarte.COEUR));
		
		assertTrue(main1.compareTo(main2) == 0);
		
		// -- TEST COULEUR --
		// main1 a une couleur supérieure à main2
		// main1 a une couleur inférieure à main2
		// main1 a une couleur égale à main2
		
		// -- TEST MAIN PLEINE --
		// main1 a une main pleine supérieure à main2
		// main1 a une main pleine inférieure à main2
		// main1 a une main pleine égale à main2
		
		// -- TEST CARRE --
		// main1 a un carré supérieur à main2
		// main1 a un carré inférieur à main2
		// main1 a un carré égale à main2
		
		// -- TEST QUINTE COULEUR --
		// main1 a une quinte couleur supérieure à main2
		// main1 a une quinte couleur inférieure à main2
		// main1 a une quinte couleur égale à main2
		
		// -- TEST QUINTUPLET --
		// main1 a un quintuplet supérieur à main2
		// main1 a un quintuplet inférieur à main2
		// main1 a un quintuplet égale à main2
		
		// -- TEST QUINTE ROYALE --
		// main1 a une quinte royale supérieure à main2
		// main1 a une quinte royale inférieure à main2
		// main1 a une quinte royale égale à main2
	}
}

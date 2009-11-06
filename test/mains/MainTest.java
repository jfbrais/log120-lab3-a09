package mains;

import java.util.ArrayList;

import cartes.Carte;
import cartes.Denomination;
import junit.framework.TestCase;

public class MainTest extends TestCase
{
	public void test�valueMain()
	{
		// -- TEST CARTE SUP�RIEURE --
		// main1 a une carte sup�rieure � main2
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
		
		// main1 a une carte inf�rieure � main2
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
		
		// main1 a une carte �gale � main2
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
		// main1 a une paire sup�rieure � main2
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
		
		// main1 a une paire inf�rieure � main2
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
		
		// main1 a une paire �gale � main2
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
		// main1 a deux paires sup�rieures � main2
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
		
		// main1 a sa paire sup�rieure qui est �gale � celle de main2
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
		
		// main1 a deux paires inf�rieures � main2
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
		
		// main1 a deux paires �galent � main2
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
		
		// main1 a deux paires �galent � main2, mais main2 a une cinqui�me carte plus �lev�e
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
		// main1 a un brelan sup�rieur � main2
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
		
		// main1 a un brelan inf�rieur � main2
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
		
		// main1 a un brelan �gale � main2
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
		// main1 a une quinte sup�rieure � main2
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
		
		// main1 a une quinte inf�rieure � main2
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
		
		// main1 a une quinte �gale � main2
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
		// main1 a une couleur sup�rieure � main2
		// main1 a une couleur inf�rieure � main2
		// main1 a une couleur �gale � main2
		
		// -- TEST MAIN PLEINE --
		// main1 a une main pleine sup�rieure � main2
		// main1 a une main pleine inf�rieure � main2
		// main1 a une main pleine �gale � main2
		
		// -- TEST CARRE --
		// main1 a un carr� sup�rieur � main2
		// main1 a un carr� inf�rieur � main2
		// main1 a un carr� �gale � main2
		
		// -- TEST QUINTE COULEUR --
		// main1 a une quinte couleur sup�rieure � main2
		// main1 a une quinte couleur inf�rieure � main2
		// main1 a une quinte couleur �gale � main2
		
		// -- TEST QUINTUPLET --
		// main1 a un quintuplet sup�rieur � main2
		// main1 a un quintuplet inf�rieur � main2
		// main1 a un quintuplet �gale � main2
		
		// -- TEST QUINTE ROYALE --
		// main1 a une quinte royale sup�rieure � main2
		// main1 a une quinte royale inf�rieure � main2
		// main1 a une quinte royale �gale � main2
	}
}

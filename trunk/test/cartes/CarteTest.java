/*
 * 2005-06-12
 * Code source inspire et traduit à partir d'un enonce de laboratoire du MIT
 * 6.170  	Laboratory in Software Engineering, Fall 2002
 * http://6170.lcs.mit.edu/www-archive/Old-2002-Fall/psets/ps2/ps2.html
 * 
 */

// cpf 2005-11-09 Mise à jour pour les types "generics" dans Java 1.5
 
package cartes;

import junit.framework.*;

/**
 * Un ensemble de test unitaires dans JUnit pour tester la classe Carte
 */
public class CarteTest extends TestCase {

    //
    // MEMBER VARIABLES
    //

    protected Carte carte;
    protected Denomination carteDenomination;
    protected CouleurCarte carteCouleur;

    protected Denomination carteDenomInf;
    protected CouleurCarte carteCoulInf;
    protected Denomination carteDenomSup;
    protected CouleurCarte carteCoulSup;



    //
    // METHODS
    //

    public CarteTest(String name) {
        super(name);
    }


    protected void setUp() {
        carte = new Carte(Denomination.VALET, CouleurCarte.PIQUE);
        carteDenomination = Denomination.VALET;
        carteCouleur = CouleurCarte.PIQUE;

        carteDenomInf = Denomination.CINQ;
        carteCoulInf = CouleurCarte.CARREAU;

        carteDenomSup = Denomination.ROI;
        carteCoulSup = CouleurCarte.COEUR;
    }


    public static Test suite() {        
        return new TestSuite(CarteTest.class);
    }


    public void testValue() {
        assertEquals(carteDenomination, carte.getDenomination());
    }


    public void testSuit() {
        assertEquals(carteCouleur, carte.getCouleur());
    }


    public void testCompareTo() {
        
        // Comparing to a null card should throw a NullPointerException.
        try {
            carte.compareTo(null);
            fail("Should raise a NullPointerException");
        }
        catch (NullPointerException npe) {
        }
        catch (Exception e) {
            fail("Should raise a NullPointerException: " + e.toString());
        }


        // Comparing to a String should throw a ClassCastException.
		// cpf 2005-11-09 le test suivant est desuet depuis Java 1.5 et les "generics"
		/*
        try {
            carte.compareTo("test");
            fail("Should raise a ClassCastException");
        }
        catch (ClassCastException cce) {
        }
        catch (Exception e) {
            fail("Should raise a ClassCastException: " + e.toString());
        }
		*/


        // A card cannot be less than the same card.
        Carte carteEgale = new Carte(carte.getDenomination(), carte.getCouleur());
        assertTrue(carte.compareTo(carteEgale) == 0);

        // Test two cards with different values and suits.
        Carte carteInf = new Carte(carteDenomInf, carteCoulInf);
        assertTrue(carte.compareTo(carteInf) > 0);
        assertTrue(carteInf.compareTo(carte) < 0);
        carteInf = new Carte(carteDenomInf, carteCoulSup);
        assertTrue(carte.compareTo(carteInf) > 0);
        assertTrue(carteInf.compareTo(carte) < 0);

        // Test two cards with equal values but different suits.
        Carte carteCoulIdenDenomInf = new Carte(carte.getDenomination(), carteCoulInf);
        assertTrue(carte.compareTo(carteCoulIdenDenomInf) == 0);
        assertTrue(carteCoulIdenDenomInf.compareTo(carte) == 0);
        
        // Test that an Ace is always greater than a two and a King.
        Carte carteAs = new Carte(Denomination.AS, carte.getCouleur());
        Carte carteDeux = new Carte(Denomination.DEUX, carte.getCouleur());
        Carte carteRoi = new Carte(Denomination.ROI, carte.getCouleur());
        assertTrue(carteAs.compareTo(carteDeux) > 0);
        assertTrue(carteAs.compareTo(carteRoi) > 0);              
    }


    public void testEquals() {
        assertTrue(!carte.equals(null));
		// cpf 2005-11-09 le test suivant n'est pas (!) desuet depuis Java 1.5 et les "generics"
		//     equals() doit être redefini avec un argument de type Object toujours.
        assertTrue(!carte.equals("test2"));
        assertEquals(carte, carte);
        assertEquals(carte, (new Carte(carte.getDenomination(), carte.getCouleur())));
        Assert.assertTrue(!carte.equals(new Carte(carteDenomInf, carte.getCouleur())));
    }
}

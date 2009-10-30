/*
 * 2005-06-12
 * Code source inspire et traduit à partir d'un enonce de laboratoire du MIT
 * 6.170  	Laboratory in Software Engineering, Fall 2002
 * http://6170.lcs.mit.edu/www-archive/Old-2002-Fall/psets/ps2/ps2.html
 */

// 2005-11-9 cpf mise à jour pour Java 1.5 et types "generics"

package cartes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Represente une valeur d'une carte, parmi 13 valeurs possibles : 
 * (ex.: valet, huit, as)
 */
public final class Denomination implements Comparable<Denomination> {


    //
    // CONSTANTES
    //

    // les 13 denominations legales

    /**
     * La denomination de carte representant le 2.
     */
    public static final Denomination DEUX   = new Denomination("deux",   "2");

    /**
     * La denomination de carte representant le 3.
     */
    public static final Denomination TROIS = new Denomination("trois", "3");

    /**
     * La denomination de carte representant le 4.
     */
    public static final Denomination QUATRE  = new Denomination("quatre",  "4");

    /**
     * La denomination de carte representant le 5.
     */
    public static final Denomination CINQ  = new Denomination("cinq",  "5");

    /**
     * La denomination de carte representant le 6.
     */
    public static final Denomination SIX   = new Denomination("six",   "6");

    /**
     * La denomination de carte representant le 7.
     */
    public static final Denomination SEPT = new Denomination("sept", "7");

    /**
     * La denomination de carte representant le 8.
     */
    public static final Denomination HUIT = new Denomination("huit", "8");

    /**
     * La denomination de carte representant le 9.
     */
    public static final Denomination NEUF  = new Denomination("neuf",  "9");

    /**
     * La denomination de carte representant le 10.
     */
    public static final Denomination DIX   = new Denomination("dix",   "10");

    /**
     * La denomination de carte representant le valet.
     */
    public static final Denomination VALET  = new Denomination("valet",  "V");

    /**
     * La denomination de carte representant la dame.
     */
    public static final Denomination DAME = new Denomination("dame", "D");

    /**
     * La denomination de carte representant le roi.
     */
    public static final Denomination ROI  = new Denomination("roi",  "R");

    /**
     * La denomination de carte representant l'as.
     */
    public static final Denomination AS   = new Denomination("as",   "A");



    // Rang des denominations

    /**
     * Une liste des denominations en ordre croissant
     */
    public static final List DENOMINATIONS = 
        Collections.unmodifiableList(Arrays.asList(new Denomination[] {
            DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI, AS
        }));

    //
    // METHODES
    //

    //-------------------------------------------
    /**
     * Cree une nouvelle denomination
     *
     * @param nom  the name of this value
     * @param caractereSurCarte     le symbole representant cette carte
     *
     */
    private Denomination(String nom, String caractereSurCarte) {
		this.nom = nom;
        this.caractereSurCarte = caractereSurCarte;
    }


    //-------------------------------------------
    /**
     * Retourne le nom de cette denomination
     * <p>
     * Par exemple "2", "3", ..., "10", "valet", "dame", "roi", ou "as".
     *
     * @return le nom de cette denomination
     */
    public String getNom() {
        return nom;
    }


	//-------------------------------------------
    /**
     * Retourne le symbole representant cette denomination
     * <p>
     * Par exemple, "2", "3", ..., "10", "V", "D", "R", ou "A"
     * 
	 * @return le symbole representant cette denomination
	 */
    public String carectereSurCarte() { 
        return caractereSurCarte;
    }


    //-------------------------------------------
    /**
     * Compare cette denomination à la denomination specifiee pour determiner l'ordre
     *
     * @param o  l'objet qui sera compare
     * @return   un entier negatif, zero ou un entier positif, selon si
     *           cette denomination est inferieure, egal ou superieure à
     * 			 l'objet specifie.
     * @exception ClassCastException si l'objet specifie n'a pas le type Denomination
     * @exception NullPointerException si l'objet specifie est null
     *
     */
    public int compareTo(Denomination o) {        
        if (o == null) {
            throw new NullPointerException();
        }

        return DENOMINATIONS.indexOf(this) - DENOMINATIONS.indexOf((Denomination)o);
    }
	

    //-------------------------------------------
    /**
     * Retourne une description de cette denomination.
     *
     * @return une description de cette denomination
     *
     */
    public String toString() { 
        return getNom(); 
    }

	//
	// VARIABLES MEMBRES
	//

	/**
	 * Le nom de cette denomination
	 */
	private final String nom;

	/**
	 * Le symbole apparaissant sur la carte 
	 */
	private final String caractereSurCarte;


}

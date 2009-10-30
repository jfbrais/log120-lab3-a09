/*
 * 2005-06-12
 * Code source inspir� et traduit � partir d'un �nonc� de laboratoire du MIT
 * 6.170  	Laboratory in Software Engineering, Fall 2002
 * http://6170.lcs.mit.edu/www-archive/Old-2002-Fall/psets/ps2/ps2.html
 * 
 * Note : support pour les ic�nes a �t� supprim�
 */
 
// 2005-11-9 cpf mise � jour pour Java 1.5 et types "generics"
package cartes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Repr�sente la couleur d'une carte. Les quatres couleurs sont : 
 * coeur, pique, carreau, tr�fle. 
 * Au poker, le terme "couleur" ne repr�sente jamais le noir ou le rouge.
 */
public final class CouleurCarte implements Comparable<CouleurCarte> {

    //
    // CONSTANTES
    //

    /**
     * La couleur de tr�fle.
     */
    public static final CouleurCarte TR�FLE = new CouleurCarte("tr�fle");

    /**
     * La couleur de carreau.
     */
    public static final CouleurCarte CARREAU = new CouleurCarte("carreau");

    /**
     * La couleur de pique.
     */
    public static final CouleurCarte PIQUE = new CouleurCarte("pique");

    /**
     * La couleur de coeur.
     */
    public static final CouleurCarte COEUR = new CouleurCarte("coeur");



    // Rang des couleurs.

    /**
     * Une liste sp�cifiant l'importance des couleurs en ordre descendant
     */
    public static final List COULEURS =
        Collections.unmodifiableList(Arrays.asList(new CouleurCarte[] {TR�FLE, CARREAU, PIQUE, COEUR}));


    //
    // VARIABLES MEMBRES
    //

    /**
     * The nom of this suit.
     */
    private final String nom;

    //
    // M�THODES
    //

    //-------------------------------------------
    /**
     * Cr�e une nouvelle couleur de carte
     *
     * @param nom le nom de la couleur
     *
     */
    private CouleurCarte(String nom) {
        if (nom == null) {
            throw new NullPointerException();
        }

        this.nom = nom;
    }


    //-------------------------------------------
    /**
     * Retourne le nom de la couleur
     *
     * @return le nom de la couleur
     *
     */
    public String getNom() {
        return nom;
    }


    //-------------------------------------------
    /**
     * Compare cette couleur � la couleur sp�cifi�e afin de d�terminer l'ordre
     *
     * @param o  l'objet qui sera compar�
     * @return   un entier n�gatif, z�ro ou un entier positif, selon si
     *           cette couleur est inf�rieure, �gal ou sup�rieure �
     * 			 l'objet sp�cifi�.
     * @exception ClassCastException si l'objet sp�cifi� n'a pas le type CouleurCarte
     * @exception NullPointerException si l'objet sp�cifi� est null
     *
     */
    public int compareTo(CouleurCarte o) {
	     
        if (o == null)
            throw new NullPointerException();
	     
        return COULEURS.indexOf(this) - COULEURS.indexOf((CouleurCarte)o);
    }


    //-------------------------------------------
    /**
     * Returns une description de cette couleur.
     *
     * @return une description de cette couleur
     */
    public String toString() {
        return getNom();
    }

}


/******************************************************
 Cours :             LOG120
 Session :           Saison automne 2009
 Groupe :            03
 Projet :            Laboratoire #3
 Étudiant(e)(s) :    Gabriel Desmarais
 					 Jean-François Brais-Villemur
 Code(s) perm. :     DESG24078908
 					 BRAJ14088901
 Professeur :        Jocelyn Benoît
 Chargé de labo.:    Vincent Carrier
 					 Yanick Rochon
 Nom du fichier :	 Couleur.java 					 
 Date créée :        2009-11-10
 Date dern. modif. : 2009-11-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-11-10 : Status Initial
 *******************************************************/

package mains.Rang;

import java.util.ArrayList;
import mains.*;
import cartes.*;

/**
 * Analyseur de main pour trouver une Couleur.
 * @author Gab
 *
 */
public class Couleur extends AbstractAnalyseurRang
{
	private CouleurCarte couleur;
	private ArrayList<Carte> collCarte = new ArrayList<Carte>();
	
	@Override
	public boolean reconnaitreMain(ReqAnalyseMain analyseMain)
	{
		collCarte = analyseMain.getMain().getCartes();
		couleur = collCarte.get(0).getCouleur();
		for (int i=1;i<5;i++)
		{
			if (collCarte.get(i).getCouleur() != couleur)
				return false;
		}
		
		analyseMain.setRangReconnu(new RangPoker(this,collCarte.get(0).getDenomination()));
		analyseMain.getRangReconnu().setCouleur(new Denomination[]{collCarte.get(0).getDenomination(),collCarte.get(1).getDenomination(),collCarte.get(2).getDenomination(),collCarte.get(3).getDenomination(),collCarte.get(4).getDenomination()});
		return true;
	}

}

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
 Nom du fichier :	 QuinteRoyale.java 					 
 Date créée :        2009-11-10
 Date dern. modif. : 2009-11-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-11-10 : Status Initial
 *******************************************************/

package mains.Rang;

import java.util.ArrayList;

import cartes.Carte;
import cartes.Denomination;
import mains.*;

/**
 * Analyseur de main pour trouver une Quinte Royale.
 * @author Gab
 *
 */
public class QuinteRoyale extends AbstractAnalyseurRang
{
	private ArrayList<Carte> collCarte = new ArrayList<Carte>();

	@Override
	public boolean reconnaitreMain(ReqAnalyseMain analyseMain)
	{
		collCarte = analyseMain.getMain().getCartes();
		
		if (new QuinteCouleur().reconnaitreMain(analyseMain))
			if (Denomination.DENOMINATIONS.indexOf(collCarte.get(1).getDenomination()) == 11 && Denomination.DENOMINATIONS.indexOf(collCarte.get(0).getDenomination()) == 12)
				{
					analyseMain.setRangReconnu(new RangPoker(this,collCarte.get(0).getDenomination()));
					return true;
				}
		
		return false;
	}

}
